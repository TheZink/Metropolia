public class CoffeeMaker {
    private boolean powerStatus;
    private String coffeeType;
    private double amount;

    // Konstruktori
    public CoffeeMaker() {
        powerStatus = false;
        coffeeType = "";
        amount = 0;
    }

    // Vaihdetaan keittimen tilaa
    public boolean coffeeMakerOnOf() {
        if (!powerStatus) {
            powerStatus = true;
        } else {
            powerStatus = false;
        }
        return powerStatus;
    }

    // Määritetään määrä
    double selectAmount(double ml) {
        amount = ml;
        return amount;
    }

    // Valitaan tyyppi
    void selectCoffee(String type) {
        coffeeType = type;
    }

    // Palautetaan kahvin tyyppi
    String getCoffee() {
        return coffeeType;
    }

    // Palautetaan määrä
    double getAmmount() {
        return amount;
    }
}