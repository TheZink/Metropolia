public class CoffeeMaker {
    private boolean powerStatus;
    private String coffeeType;
    private double amount;

    public CoffeeMaker() {
        powerStatus = false;
        amount = 0;
    }

    void coffeeMakerOnOf() {
        if (!powerStatus) {
            powerStatus = true;
        } else {
            powerStatus = false;
        }
    }

    void selectAmount(double ml) {
        amount = ml;
    }
}
