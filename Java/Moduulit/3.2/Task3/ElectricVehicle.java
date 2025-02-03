package Task3;

interface ElectricVehicle {
    void start();
    void stop();
    void charge();
    void getInfo();
}

class ElectricCar extends AbstractVehicle {
    public ElectricCar(String fuel, String color, int capacity){
        super(fuel, color, capacity);
    }

    public void start(){
        System.out.println("Electric car is starting");
    }

    public void stop(){
        System.out.println("Electric car is stopping");
    }

    @Override
    public void charge(){
        System.out.println("Electric car is charging");
    }

    public void getInfo(){
        System.out.println("eCar Information:");
        super.getInfo();
    }

}

class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String fuel, String color, int capacity){
        super(fuel, color, capacity);
    }

    public void start(){
        System.out.println("Electric motorcycle is starting");
    }

    public void stop(){
        System.out.println("Electric motorcycle is stopping");
    }

    @Override
    public void charge(){
        System.out.println("Electric motorcycle is charging");
    }

    public void getInfo(){
        System.out.println("eMotorcycle Information:");
        super.getInfo();
    }
}

class ElectricBus extends AbstractVehicle {
    public ElectricBus(String fuel, String color, int capacity){
        super(fuel, color, capacity);
    }

    public void start(){
        System.out.println("Electric bus is starting");
    }

    public void stop(){
        System.out.println("Electric bus is stopping");
    }

    @Override
    public void charge(){
        System.out.println("Electric bus is charging");
    }

    public void getInfo(){
        System.out.println("eBus Information:");
        super.getInfo();
    }

}
