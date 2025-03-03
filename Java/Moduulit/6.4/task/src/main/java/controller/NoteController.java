package controller;

import module.Note;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentField;

    @FXML
    private Button saveButton;

    @FXML
    private Button getButton;

    @FXML
    private Button clearButton;

    @FXML
    private Label statusLabel;

    @FXML
    private Label printLabel;

    @FXML
    private void initialize(){

        Note note = new Note("","");
        printLabel.setText("");
        statusLabel.setText("");

        contentField.setOnMouseClicked(event -> {
            if (contentField.getText().equals("Kirjoita muistiinpano tähän...")) {
                contentField.setText("");
            }
        });

        titleField.setOnMouseClicked(event -> {
            if (titleField.getText().equals("Aihe")) {
                titleField.setText("");
            }
        });
        
        // Action save title and content to the notebook
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                try {
                    System.out.println("saveButton is pressed");
                    String title = titleField.getText();
                    String content = contentField.getText();

                    note.setTitle(title);
                    note.setContent(content);
                    note.saveContent();

                    statusLabel.setText("Muistiinpano tallennettu onnistuneesti");

                } catch (Exception e) {
                    statusLabel.setText("Virhe: " + e);
                }
            }
        });

        // Action retrieve note from notebook
        getButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    System.out.println("getButton is pressed");
                    
                    String title = titleField.getText();
                    note.setTitle(title);
                    note.retrieveContent();

                    if (note.getContent() != null) {
                        printLabel.setText(note.getContent());
                        statusLabel.setText("Muistiinpano tulostettiin onnistuneesti");


                    } else {
                        statusLabel.setText("Muistiinpanoa ei löytynyt");
                        contentField.setText("");
                        printLabel.setText("");
                    }

                } catch (Exception e) {
                    statusLabel.setText("Virhe: " + e);
                }
            }
        });

        // Action clear all fields from user input
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("clearButton is pressed");
                
                try{
                    titleField.setText("");
                    contentField.setText("");
                    printLabel.setText("");
                    
                    note.setTitle("");
                    note.setContent("");
                    
                    statusLabel.setText("Kentät tyhjennetty onnistuneesti");

                } catch (Exception e) {
                    statusLabel.setText("Virhe: " + e);
            }
        };
    });
    }
}
