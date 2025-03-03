package controller;

import view.noteGUI;
import module.Note;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class noteCotroller {

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
    private void inputNote(){
        String title = titleField.getText();
        String content = contentField.getText();
        
        Note note = new Note(title, content);

        // Action save title and content to the notebook
        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                try {
                    System.out.println("saveButton is pressed");
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
                    note.setTitle(title);
                    note.getContent();

                    statusLabel.setText("Muistiinpano tulostettiin onnistuneesti");
                } catch (Exception e) {
                    statusLabel.setText("Virhe: " + e);
                }
            }
        });

        // Action clear all fields and return to the original value
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                titleField.setText("Aihe");
                contentField.setText("Kirjoita muistiinpano tähän...");
                statusLabel.setText("Kentät tyhjennetty onnistuneesti");
            }
        });

    }


}
