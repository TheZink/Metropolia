package view;

import controller.CurrController;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrGUI extends Application {
    private CurrController controller;
    private List<String> currency;

    // Luodaan kontrollerin kutsu
    public void init() {
        controller = new CurrController();
        currency = controller.getCurrencyNames();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("ValuuttaMuunnin 0.2");

        Label status = new Label("Valitse valuutat ja syötä summa.");
        AnchorPane topPane = new AnchorPane();
        AnchorPane middlePane = new AnchorPane();
        AnchorPane bottomPane = new AnchorPane();

        // Luodaan pudotusvalikot
        ComboBox<String> fromCurr = new ComboBox<>();
        ComboBox<String> toCurr = new ComboBox<>();

        // Asetetaan pudotusvalikoille arvot ja oletusarvot
        fromCurr.getItems().addAll(currency);
        toCurr.getItems().addAll(currency);
        fromCurr.setValue("Mistä valuutasta?");
        toCurr.setValue("Mihin valuuttaan?");

        // Luodaan tekstikenttä ja nappi
        TextField amount = new TextField("Syötä summa");
        TextField result = new TextField("Tulos");
        result.setEditable(false);

        Button convert = new Button("Muunna");

        // Asetetaan elementit ikkunaan
        topPane.getChildren().add(fromCurr);
        topPane.getChildren().add(toCurr);
        middlePane.getChildren().add(amount);
        middlePane.getChildren().add(result);
        bottomPane.getChildren().add(convert);
        bottomPane.getChildren().add(status);

        AnchorPane.setTopAnchor(fromCurr, 10.0);
        AnchorPane.setLeftAnchor(fromCurr, 10.0);

        AnchorPane.setTopAnchor(toCurr, 10.0);
        AnchorPane.setRightAnchor(toCurr, 10.0);

        AnchorPane.setTopAnchor(amount, 10.0);
        AnchorPane.setLeftAnchor(amount, 10.0);

        AnchorPane.setTopAnchor(result, 10.0);
        AnchorPane.setRightAnchor(result, 10.0);

        AnchorPane.setBottomAnchor(convert, 10.0);
        AnchorPane.setRightAnchor(convert, 10.0);

        AnchorPane.setBottomAnchor(status, 10.0);
        AnchorPane.setLeftAnchor(status, 10.0);

        VBox layout = new VBox(topPane,middlePane,bottomPane);

        // Tarkastetaan kontrollerin ja tietokannan tila

        if (controller != null) {
            
            if (controller.dbStatus) {
                
                // Asetetaan tapahtumankäsittelijät

                amount.setOnMouseClicked(e -> {
                    amount.setText("");
                });

                fromCurr.setOnMouseClicked(e -> {
                    fromCurr.setValue("");
                });

                toCurr.setOnMouseClicked(e -> {
                    toCurr.setValue("");
                });

                convert.setOnAction(e -> {

                    // Tarkistetaan ComboBoxien ja tekstikentän arvot
            
                    if (!currency.contains(fromCurr.getValue()) || !currency.contains(toCurr.getValue())) { 
                        status.setText("Valitse valuutat!");
                        
                    } else if (amount.getText().isEmpty()) {
                        status.setText("Syötä summa!");                        
                        
                    } else {
                        try {
                            String exce = controller.convert(fromCurr.getValue(), toCurr.getValue(), amount.getText());
                            result.setText(exce);
                            status.setText("Valitse valuutat ja syötä uusi summa.");
                        } catch (Exception ex) {
                            status.setText("Error! " + ex.getMessage());
                            System.out.println("Controller error: " + ex.getMessage());
                        }
                    }
                });

            }
            else {
                status.setText("Tietokanta ei ole käytettävissä.");
            }
        } 
        else {
            status.setText("Kontrolleria ei ole alustettu oikein.");
        }

        Scene scene = new Scene(layout, 325, 100);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }
}