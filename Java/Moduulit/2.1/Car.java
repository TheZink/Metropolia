public class Car {
    private double speed;
    private double speedTop;
    private double gasolineLevel;
    private double gasolineCapacity;
    private String typeName;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        gasolineCapacity = 100;
        this.typeName = typeName;

    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            if (speed > speedTop) {
                speedTop = speed;
            }
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
        }
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    // Palautetaan huippunopeus
    double getTopSpeed() {
        return speedTop;
    }
}
