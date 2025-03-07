package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

import application.*;

public class CurrController {
    private ConverterApp converter;
    public boolean dbStatus;

    @FXML
    private ComboBox<String> fromCurrList;
    @FXML
    private ComboBox<String> toCurrList;
    @FXML
    private TextField amountField;
    @FXML
    private TextField resultField;
    @FXML
    private Label selLabel;
    @FXML
    private Label countryLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Button convertButton;
    @FXML
    private Button addButton;
    @FXML
    private Button clearButton;

    @FXML
    private void initialize() {
        converter = new ConverterApp();

        converter.getAllCurrency();
        fromCurrList.getItems().addAll(converter.getNames());
        toCurrList.getItems().addAll(converter.getNames());

        // Käynnistetään toinen ikkuna, jossa valuutan lisäys
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Add button pressed");

                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Currency_view2.fxml"));
                    Stage dialogStage = new Stage();
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    dialogStage.setTitle("Add currency");
                    
                    dialogStage.setScene(scene);
                    dialogStage.show();

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Convert button pressed");

                String from = fromCurrList.getValue();
                String to = toCurrList.getValue();
                double amount = Double.parseDouble(amountField.getText());

                double result = converter.convertCurrency(from, to, amount);
                resultField.setText(String.format("%.2f", result));

            }
        });

        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){

                System.out.println("Clear button pressed");

                fromCurrList.setValue("");
                toCurrList.setValue("");
                amountField.setText("");
                resultField.setText("");

                selLabel.setText("");
                countryLabel.setText("");
                nameLabel.setText("");

            }            
        });

    }
}
