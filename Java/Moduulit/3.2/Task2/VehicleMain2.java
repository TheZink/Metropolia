package Task2;

interface Vehicle {
    void start();
    void stop();
    void getInfo();    
}

abstract class AbstractVehicle implements Vehicle {
    protected String fuel;
    protected String color;
    protected int capacity;

    public AbstractVehicle(String fuel, String color, int capacity) {
        this.fuel = fuel;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public void getInfo() {
        System.out.println("Fuel: "+ fuel);
        if (color != "") { System.out.println("Color: "+color + "\n"); } 
        if (capacity != (0)) { System.out.println("Capacity: " + capacity + "\n"); }
    }
}

class Car extends AbstractVehicle {
    public Car(String fuel, String color, int capacity) {
        super(fuel,color,capacity);
    }

    
    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }

    @Override
    public void getInfo(){
        System.out.println("Car Information:");
        super.getInfo();
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle(String fuel, String color, int capacity) {
        super(fuel,color,capacity);
    }


    @Override
    public void start(){
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle is stopping");
    }

    @Override
    public void getInfo(){
        System.out.println("Motorcycle Information:");
        super.getInfo();
    }

}

class Bus extends AbstractVehicle {
    public Bus(String fuel, String color, int capacity) {
        super(fuel,color,capacity);
    }


    @Override
    public void start(){
        System.out.println("Bus is starting");
    }

    @Override
    public void stop(){
        System.out.println("Bus is stopping");
    }

    @Override
    public void getInfo(){
        System.out.println("Bus Information:");
        super.getInfo();
    }

}

public class VehicleMain2 {
    private static void VehicleAction(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        Vehicle car = new Car("Petrol","Red",0);
        Vehicle motorcycle = new Motorcycle("Gasoline","Black",0);
        Vehicle bus = new Bus("Diesel","", 50);


        VehicleAction(car);
        VehicleAction(motorcycle);
        VehicleAction(bus);
    }
}