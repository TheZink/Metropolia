class Bus extends Car1 {
    public Bus(String typeName, double accelRate, double consRate, double gasLevel) {
        super(typeName, accelRate, consRate, gasLevel);
    }

    void driveBus(){
        fillTank(400);
        while (getGasolineLevel() > 0) {
            
            // Simuloidaan matkustajien poistumista ja nousemista bussin kyytiin
            
            for (int i = 0; i <= 12; i++) {
                accelerate();
                
                // Matkustajat poistuvat bussista
                if (i % 4 == 0) {
                    System.out.println("Bussi pysähtyy, koska stop-nappula on painettu.");
                    while (getSpeed() > 0) {
                        decelerate(5);
                        System.out.println("Nopeus on " + getSpeed() + " km/h");
                    }
                    passengerExit(1);
                    System.out.println("Bussin kyydissä on nyt " + getPassenger() + " matkustajaa" );
                }

                // Matkustajat nousevat bussiin
                if (i % 2 == 0) {
                    System.out.println("Bussi pysähtyy, koska pysäkillä on asiakkaita.");
                    while (getSpeed() > 0) {
                        decelerate(5);
                        System.out.println("Nopeus on " + getSpeed() + " km/h");
                    }
                    passengerEnter(2);
                    System.out.println("Bussin kyydissä on nyt " + getPassenger() + " matkustajaa" );
                }
                
                System.out.println(getTypeName() + ": nopeus on " + getSpeed() + " km/h");
                System.out.println("Polttoaineen määrä on: " + getGasolineLevel());

            }
        }
    }
}

// Main
public class DriveBus {
    public static void main(String[] args) {
        Bus drive = new Bus("Malli 1", 8, 10, 500);
        drive.driveBus();
    }
}
