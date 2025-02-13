package HelloWorld;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class HelloWorldApplication extends Application {
    public void start(Stage stage) {
            Label text = new Label("Hello World!");
            Button btn = new Button("Click me!");

            btn.setOnAction(new EventHandler<ActionEvent>() {
                    private int state = 0;
                    public void handle(ActionEvent event) {

                            switch (state) {
                                case 0: text.setText("Hello Universe!"); break;
                                case 1: text.setText("Hello All!"); break;
                                case 2: text.setText("Hello You!"); break;
                            }
                            state++;
                            if (state > 2) state = 0;
                    }
            });

            FlowPane componentGroup = new FlowPane();
            componentGroup.getChildren().add(text);
            componentGroup.getChildren().add(btn);

            Scene scene = new Scene(componentGroup);
            stage.setScene(scene);
            stage.setTitle("Hello World");
            stage.show();
    }
}