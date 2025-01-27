public class Car {
    private double speed;
    private double topSpeed;
    private double cruise_min;
    private double cruise_max;
    private boolean cruise_status;
    private double gasolineLevel;
    private double gasolineCapacity;
    private String typeName;

    public Car(String typeName) {
        speed = 0;
        cruise_min = 0;
        cruise_max = 0;
        gasolineLevel = 0;
        gasolineCapacity = 100;
        cruise_status = false;
        this.typeName = typeName;

    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 5;

            if (speed > topSpeed) {
                topSpeed = speed;
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

   // Cruise control

    double getTopSpeed() {
        return topSpeed;
    }

    void turnOn(boolean value) {
        cruise_status = value;
    }

    void setSpeed(int set) {
        cruise_max = set;
    }

    double getMinSpeed() {
        return cruise_min;
    }

    double getMaxSpeed() {
        return cruise_max;
    }

    boolean cruiseControlStatus() {
        return cruise_status;
    }

    void regulateSpeed(Car car) {
        // Verrataan "speed" ja "cruise_max" arvot
        if (speed < cruise_max && gasolineLevel > 0) {
            accelerate();
        }
        // Tarkastetaan ylittääkä "speed"-arvo "cruise_max"-arvon
        else if (speed > cruise_max && gasolineLevel > 0) {
            car.decelerate(5);
            System.out.println("Varoitus! Ajoimme ylinopeutta");
        }
    }
}
