package view;

import controller.DictionaryController;
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
    private int modeStatus = 0;                   // Ohjelman tila. 0 = lisäys, 1 = haku
    private DictionaryController controller;

    // Luodaan kontrollerille kutsu
    public void init() {
        controller = new DictionaryController();
    }

    @Override
    public void start(Stage stage) {

        // Luodaan komponentit näkymälle
        Button modeButton = new Button("Haku-toiminto");
        Button excButton = new Button("Suorita");
        TextField wordField = new TextField("Lisää sana");
        TextField meaningField = new TextField("Kirjoita merkitys");
        FlowPane componentGroup = new FlowPane();

        Label meaningLabel = new Label();

        // Yhdistetään komponentit ryhmäksi
        componentGroup.getChildren().add(wordField);
        componentGroup.getChildren().add(meaningField);
        componentGroup.getChildren().add(excButton);
        componentGroup.getChildren().add(modeButton);
        componentGroup.getChildren().add(meaningLabel);

        modeButton.setOnAction (new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                // Tila, jossa käyttäjä voi etsiä sanoja
                if (modeStatus == 0) {
                    modeStatus = 1;
                    meaningField.setVisible(false);             // Piilotetaan merkitys-kenttä
                    modeButton.setText("Lisäys-toiminto");      // Muutetaan toimintanäppäin "lisäys"
                    wordField.setText("Etsi sana");
                
                // Tila, jossa käyttäjä voi lisätät sanoja
                } else if (modeStatus == 1) {
                    modeStatus = 0;
                    meaningField.setVisible(true);              // Näytetään merkitys-kenttä
                    modeButton.setText("Haku-toiminto");        // Muutetaan toimintanäppäin "haku"
                    wordField.setText("Lisää sana");
                    meaningField.setText("Kirjoita merkitys");
                }
            }
        });

        excButton.setOnAction(e -> {
            
            // Jos kontrolleri on asetettu oikein, niin mennään tänne
            if (controller != null) { 

                if (modeStatus == 0) {

                    // Jos kentät eivät ole oletusarvoissa, niin lisätään sana
                    if (!wordField.getText().equals("Lisää sana") && !meaningField.getText().equals("Kirjoita merkitys")) {
                        controller.addWord(wordField.getText(), meaningField.getText());
                    } else {
                        meaningLabel.setText("Ei voida lisätä kirjastoon, koska et syöttänyt sanaa tai merkitystä");
                    }

                } else {

                    // Jos kenttä ei ole oletusarvossa, niin haetaan sana
                    if (!wordField.getText().equals("Etsi sana")) {
                        String meaning = controller.getMeaning(wordField.getText());
                        meaningLabel.setText(meaning);
                    } else {
                        meaningLabel.setText("Ei voida hakea sanaa, koska et syöttänyt sitä kenttään");
                    }
                }
                
            // Tulostetaan kontrollerin virheilmoitus
            } else {
                meaningLabel.setText("Kontrolleriin ei saada yhteyttä");
            }
        });

        Scene view = new Scene(componentGroup, 450, 100);   
        stage.setTitle("Sanakirja");
        stage.setScene(view);
        stage.show();
    }
}