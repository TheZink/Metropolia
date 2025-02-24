package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application{
    int modeStatus = 0;


    @Override
    public void start(Stage stage) {

        Button modeButton = new Button("Lisää sana");
        Button wordButton = new Button("Hae");
        TextField wordField = new TextField("Kirjoita sana");
        TextField meaningField = new TextField("Kirjoita merkitys");
        FlowPane componentGroup = new FlowPane();

        Label meaningLabel = new Label();

        componentGroup.getChildren().add(wordField);
        componentGroup.getChildren().add(meaningField);
        componentGroup.getChildren().add(wordButton);
        componentGroup.getChildren().add(modeButton);

        modeButton.setOnAction (new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (modeStatus == 0) {
                    modeStatus = 1;
                    modeButton.setText("Hae sanaa");
                    meaningField.setVisible(true);
                    wordButton.setText("Lisää");
                } else {
                    modeButton.setText("Lisää sana");
                    modeStatus = 0;
                    meaningField.setVisible(false);
                    wordButton.setText("Hae");
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}