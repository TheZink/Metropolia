package controller;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import application.ConverterApp;
import javafx.stage.Stage;

public class AddCurrController {
    private ConverterApp converter;

    @FXML
    private TextField CurrField;
    @FXML
    private TextField CurrCodeField;
    @FXML
    private TextField CurrRateField;
    @FXML
    private Button saveButton;
    @FXML
    private Button clearButton;
    @FXML
    private Label statusLabel;

    @FXML
    private void initialize() {
        converter = new ConverterApp();
        
        
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Save button pressed");

                String name = CurrField.getText();
                String code = CurrCodeField.getText();
                double rate = Double.parseDouble(CurrRateField.getText().replace(",", "."));

                // Tarkistetaan, että kentät eivät ole tyhjiä
                if(!CurrRateField.getText().isEmpty() && !CurrCodeField.getText().isEmpty() && !CurrField.getText().isEmpty()) {
                    
                    converter.addCurrency(name, code, rate);
                    
                    // Suljetaan ikkuna
                    Stage stage = (Stage) saveButton.getScene().getWindow();
                    stage.close();
                } 

                else {
                    statusLabel.setText("Please fill all fields");
                }
            }
        });

        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Clear button pressed");
                CurrField.clear();
                CurrCodeField.clear();
                CurrRateField.clear();
            }
        });
    }


}
