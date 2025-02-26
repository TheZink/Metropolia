package view;

import controller.CurrController;
import java.util.List;
import java.util.Arrays;
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
    private List<String> currency = Arrays.asList("EURO", "USD", "GBP", "SEK", "JPY");

    // Luodaan kontrollerin kutsu
    public void init() {
        controller = new CurrController();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("ValuuttaMuunnin 0.1");

        Label status = new Label("Valitse valuutat ja syötä summa.");
        AnchorPane topPane = new AnchorPane();
        AnchorPane middlePane = new AnchorPane();
        AnchorPane bottomPane = new AnchorPane();

        // Luodaan pudotusvalikot
        ComboBox<String> fromCurr = new ComboBox<>();
        ComboBox<String> toCurr = new ComboBox<>();

        // Asetetaan pudotusvalikoille arvot ja oletusarvot
        fromCurr.getItems().addAll("EURO", "USD", "GBP", "SEK", "JPY");
        toCurr.getItems().addAll("EURO", "USD", "GBP", "SEK", "JPY");
        fromCurr.setValue("Mistä valuutasta?");
        toCurr.setValue("Mihin valuuttaan?");

        // Luodaan tekstikenttä ja nappi
        TextField fromCurrAmount = new TextField("Syötä summa");
        TextField result = new TextField("Tulos");
        result.setEditable(false);

        Button convert = new Button("Muunna");

        // Asetetaan elementit ikkunaan
        topPane.getChildren().add(fromCurr);
        topPane.getChildren().add(toCurr);
        middlePane.getChildren().add(fromCurrAmount);
        middlePane.getChildren().add(result);
        bottomPane.getChildren().add(convert);
        bottomPane.getChildren().add(status);

        AnchorPane.setTopAnchor(fromCurr, 10.0);
        AnchorPane.setLeftAnchor(fromCurr, 10.0);

        AnchorPane.setTopAnchor(toCurr, 10.0);
        AnchorPane.setRightAnchor(toCurr, 10.0);

        AnchorPane.setTopAnchor(fromCurrAmount, 10.0);
        AnchorPane.setLeftAnchor(fromCurrAmount, 10.0);

        AnchorPane.setTopAnchor(result, 10.0);
        AnchorPane.setRightAnchor(result, 10.0);

        AnchorPane.setBottomAnchor(convert, 10.0);
        AnchorPane.setRightAnchor(convert, 10.0);

        AnchorPane.setBottomAnchor(status, 10.0);
        AnchorPane.setLeftAnchor(status, 10.0);

        VBox layout = new VBox(topPane,middlePane,bottomPane);

        // Asetetaan tapahtumankäsittelijä
        convert.setOnAction(e -> {
            
            if (controller != null) {

                // Tarkistetaan ComboBoxien ja tekstikentän arvot
                if (!currency.contains(fromCurr.getValue()) || !currency.contains(toCurr.getValue())) { 
                    status.setText("Valitse valuutat!");
                    
                } else if (fromCurrAmount.getText().isEmpty() || fromCurrAmount.getText().equals("Syötä summa")) {
                    status.setText("Syötä summa!");                        
                    
                } else {
                    try {
                        String exce = controller.convert(fromCurr.getValue(), toCurr.getValue(), fromCurrAmount.getText());
                        result.setText(exce);
                        status.setText("Valitse valuutat ja syötä uusi summa.");
                    } catch (Exception ex) {
                        status.setText("Error! " + ex.getMessage());
                        System.out.println("Controller error: " + ex.getMessage());
                    }
                }
            } else {
                status.setText("Virhe kontrollerin yhteydessä");
            }   
        });

        Scene scene = new Scene(layout, 325, 100);
        stage.setScene(scene);
        stage.show();

    }
}