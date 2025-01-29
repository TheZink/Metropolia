public class Car1 {
    private double speed;
    private double accelRate;
    private double consRate;
    private double gasLevel;
    private double passengerAmount;
    private String typeName;

    public Car1(String typeName, double accelRate, double consRate,double gasLevel) {
        speed = 0;
        passengerAmount = 0;
        this.gasLevel = gasLevel;
        this.typeName = typeName;
        this.accelRate = accelRate;
        this.consRate = consRate;

    }

    public void accelerate() {
        if (gasLevel > 0) {
            speed += accelRate;
            gasLevel -= consRate;

        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasLevel > 0) {
            speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
        }
    }

    double getSpeed() { return speed; }
    String getTypeName() { return typeName;}
    double getGasolineLevel() { return gasLevel;}
    double getPassenger() {return passengerAmount;}

    void fillTank(double amount) { gasLevel = amount; }
    void passengerEnter(double amount) { passengerAmount += amount; }
    void passengerExit(double amount) { passengerAmount -= amount; }
}
