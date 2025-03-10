package controller;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import application.ConverterApp;
import javafx.stage.Stage;

public class AddCurrController {
    private ConverterApp converter;

    @FXML
    private TextField currField;
    @FXML
    private TextField countryField;
    @FXML
    private TextField ratesField;
    @FXML
    private Button saveButton;
    @FXML
    private Button clearButton;
    @FXML
    private Text statusText;

    @FXML
    private void initialize() {
        converter = new ConverterApp();
        
        
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Save button pressed");

                String code = currField.getText().toUpperCase();
                String name = countryField.getText();
                double rate = Double.parseDouble(ratesField.getText().replace(",", "."));

                // Tarkistetaan, että kentät eivät ole tyhjiä
                if(!ratesField.getText().isEmpty() && !countryField.getText().isEmpty() && !currField.getText().isEmpty()) {
                    
                    converter.addCurrency(code, name, rate);
                    
                    // Suljetaan ikkuna
                    Stage stage = (Stage) saveButton.getScene().getWindow();
                    stage.close();
                } 

                else {
                    statusText.setText("Please fill all fields");
                }
            }
        });

        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Clear button pressed");
                currField.clear();
                countryField.clear();
                ratesField.clear();
            }
        });
    }


}
