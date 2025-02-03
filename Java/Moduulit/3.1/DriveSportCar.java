class SportsCar extends Car1 {
    public SportsCar(String typeName, double accelRate, double consRate, double gasLevel) {
        super(typeName, accelRate, consRate, gasLevel);
    }

    void driveCar() {
        fillTank(200);
        while (getGasolineLevel() > 0) {
            accelerate();
            System.out.println(getTypeName() + ": speed is " + getSpeed() + " km/h");
            System.out.println("Fuel level is: " + getGasolineLevel());
        }
    }
}

// Main
public class DriveSportCar {
    public static void main(String[] args) {
        SportsCar drive = new SportsCar("Ferrari", 20, 10, 300);
        drive.driveCar();
    }
}
