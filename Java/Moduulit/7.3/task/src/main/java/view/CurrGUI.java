package view;

import javafx.stage.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;

public class CurrGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //controller = new CurrController();

        primaryStage.setTitle("Currency converter");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Currency_view.fxml"));
        //loader.setController(controller);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
