package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class noteGUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Note");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
