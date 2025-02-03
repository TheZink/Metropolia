package Task4;

interface Vehicle {
    void start();
    void stop();
    void charge();    
    void getInfo();
}

class Car extends AbstractVehicle {
    public Car(String type, String fuel, String color, int capacity, double fuelConsume) {
        super(type,fuel,color,capacity,fuelConsume);
    }
  
    public void start(){ super.start();}
    public void stop(){ super.stop(); }
    public void charge(){ super.charge(); }

    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " liter per kilometer \n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }

}

class Motorcycle extends AbstractVehicle {
    public Motorcycle(String type, String fuel, String color, int capacity, double fuelConsume) {
        super(type, fuel,color,capacity,fuelConsume);
    }

    public void start(){ super.start();}
    public void stop(){ super.start(); }
    public void charge(){ super.charge(); }

    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " liter per kilometer\n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }

}

class Bus extends AbstractVehicle {
    public Bus(String type, String fuel, String color, int capacity, double fuelConsume) {
        super(type,fuel,color,capacity,fuelConsume);
    }

    public void start(){ super.start();}
    public void stop(){ super.stop(); }
    public void charge(){ super.charge(); }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " liter per kilometer\n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }
}
