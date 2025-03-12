package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.time.*;
import java.sql.*;

import application.*;
import entity.*;

public class CurrController {
    private ConverterApp converter;
    private TransactionApp transaction;
    private Date date;

    @FXML
    private ComboBox<String> fromCurrList;
    @FXML
    private ComboBox<String> toCurrList;
    @FXML
    private TextField amountField;
    @FXML
    private TextField resultField;
    @FXML
    private Label selText;
    @FXML
    private Label nameText;
    @FXML
    private Label ratesText;
    @FXML
    private Button convertButton;
    @FXML
    private Button addButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button refreshButton;

    @FXML
    private void initialize() {
        converter = new ConverterApp();
        transaction = new TransactionApp();
        date = Date.valueOf(LocalDate.now());
        //DatabaseInitializer db = new DatabaseInitializer();

        //db.initialize();
        try {
            converter.getAllCurrency();
        } catch (Exception e) {
            e.printStackTrace();
            selText.setText("Error: Problem with database");
            System.out.println("Error: " + e.getMessage());
        }

        fromCurrList.getItems().addAll(converter.getNames());
        toCurrList.getItems().addAll(converter.getNames());

        // Käynnistetään toinen ikkuna, jossa valuutan lisäys
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Add button pressed");

                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Currency_view_2.fxml"));
                    Stage dialogStage = new Stage();
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    dialogStage.setTitle("Add currency");
                    
                    dialogStage.setScene(scene);
                    dialogStage.show();

                } catch (Exception e) {
                    e.printStackTrace();
                    selText.setText("Error: " + e.getMessage());
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });

        // Päivitetään valuuttalista
        refreshButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Refresh button pressed");

                converter.getAllCurrency();
                fromCurrList.getItems().clear();
                toCurrList.getItems().clear();
                fromCurrList.getItems().addAll(converter.getNames());
                toCurrList.getItems().addAll(converter.getNames());
            }
            
        });

        // Muunnetaan valuutta
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Convert button pressed");

                if (fromCurrList.getValue() == null || toCurrList.getValue() == null || amountField.getText().isEmpty()) {
                    System.out.println("Error: Empty field");
                    selText.setText("Error: Please fill all fields");
                    return;
                } else {
                    String from = fromCurrList.getValue();
                    String to = toCurrList.getValue();
                    double amount = Double.parseDouble(amountField.getText());

                    double result = converter.convertCurrency(from, to, amount);
                    resultField.setText(String.format("%.2f", result));
            
                    // Tallenetaan tapahtuma tietokantaan
                    transaction.setTransaction(date.toString(),from, to, amount, result);

                    Currency currency = converter.getCurrency(to);
                    selText.setText("Selected currency: " + currency.getCode());
                    nameText.setText("Name: " + currency.getName());
                    ratesText.setText("Rates: " + currency.getRates());
                }
            }
        });

        // Tyhjennetään kentät
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){

                System.out.println("Clear button pressed");

                fromCurrList.setValue("");
                toCurrList.setValue("");
                amountField.setText("");
                resultField.setText("");

                selText.setText("");
                nameText.setText("");
                ratesText.setText("");

            }            
        });

    }
}
