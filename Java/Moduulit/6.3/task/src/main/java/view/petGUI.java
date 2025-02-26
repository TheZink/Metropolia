package view;

import controller.petContr;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.util.Duration;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;

public class petGUI extends Application {
    private petContr controller;

    public void init() {
        controller = new petContr();
    }

    public void start(Stage stage) {
        stage.setTitle("My Pet");

        // Luodaan canvas ja kuva vihaisesta kissasta
        Canvas canvas = new Canvas(800, 600);
        Pane root = new Pane();
        root.getChildren().add(canvas);

        Image image = new Image("evilcat.jpg");
        ImageView imageView = new ImageView(image);

        // Määritetään kuvan koko
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);

        root.getChildren().add(imageView);

        // Luodaan hidastettu kuvan siirtymä (Copilotin ehdottama)
        TranslateTransition transition = new TranslateTransition(Duration.millis(500), imageView);
        transition.setAutoReverse(false);

        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            controller.setMouse(x, y);
            transition.setToX(controller.getMouseX());
            transition.setToY(controller.getMouseY());
            transition.playFromStart();
            
        });

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
