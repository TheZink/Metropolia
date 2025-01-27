public class CruiseControl {

    private int min_speed;
    private int max_speed;
    private boolean isOn;


    public CruiseControl() {
        min_speed = 30;
        max_speed = 0;
        isOn = false;       
    }

    void turnOn(boolean value) {
        isOn = value;
    }

    void setSpeed(int set) {
        max_speed = set;
    }

    int getMinSpeed(){
        return min_speed;
    }

    int getMaxSpeed() {
        return max_speed;
    }

    boolean cruiseControlStatus() {
        return isOn;
    }

    void regulateSpeed(Car car){
        // Verrataan car.speed ja max_speed arvot
        if (car.getSpeed() < max_speed && car.getGasolineLevel() > 0) {
            car.accelerate();
        }
        // Tarkastetaan ylittääkä car.speed max_speed-arvon
        else if (car.getSpeed() > max_speed) {
            car.decelerate(5);
            System.out.println("Varoitus! Ajoimme ylinopeutta");
        }
    }
}
