package Task4;

interface ElectricVehicle {
    void start();
    void stop();
    void charge();
    void getInfo();
}

class ElectricCar extends AbstractVehicle {
    public ElectricCar(String type, String fuel, String color, int capacity, double fuelConsume){
        super(type,fuel,color,capacity,fuelConsume);
    }

    public void start(){ super.start();}
    public void stop(){ super.stop(); }
    
    @Override
    public void charge(){ System.out.println(type + " car is charging");}
    
    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " kWh per kilometer \n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }

}

class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String type, String fuel, String color, int capacity, double fuelConsume){
        super(type,fuel,color,capacity,fuelConsume);
    }

    public void start(){ super.start();}
    public void stop(){ super.stop(); }
    
    @Override
    public void charge(){ System.out.println(type + " car is charging");}
    
    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " kWh per kilometer \n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }
}

class ElectricBus extends AbstractVehicle {
    public ElectricBus(String type, String fuel, String color, int capacity, double fuelConsume){
        super(type,fuel,color,capacity,fuelConsume);
    }

    public void start(){ super.start();}
    public void stop(){ super.stop(); }
    
    @Override
    public void charge(){ System.out.println(type + " car is charging");}
    
    public void getInfo(){
        super.getInfo();
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " kWh per kilometer \n");
    }

    @Override
    public double calculateFuelEfficiency() { return fuelConsume; }

}
