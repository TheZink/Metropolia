import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        Scanner scanner = new Scanner(System.in);

        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Pyydetään käyttäjältä syötettä, asetetaanko CruiseControl.IsOn arvoksi true.
        if (myCar.getSpeed() > 0) {
            System.out.println("Cruisecontrol: 1) On 2) Off");
            int turn = scanner.nextInt();
            if (turn == 1) {
                System.out.println("Set max speed:");
                int inputSpeed = scanner.nextInt();
                myCar.turnOn(true);
                myCar.setSpeed(inputSpeed);
            }

            while (myCar.getGasolineLevel() > 0 && myCar.getSpeed() > 0) {
                
                // Tarkastetaan, onko CruiseControl.isOn arvo true ja onko myCar.speed isompi kuin CruiseControl.min_speed               
                if (myCar.cruiseControlStatus() && myCar.getSpeed() > myCar.getMinSpeed()) {
                    myCar.regulateSpeed(myCar);
                    System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
                } else {
                    myCar.accelerate();
                    System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
                }
            }
        }
        System.out.println("Top speed is: " + myCar.getTopSpeed());
        scanner.close();
    }
}
