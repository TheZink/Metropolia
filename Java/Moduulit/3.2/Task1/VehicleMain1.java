package Task1;

interface Vehicle {
    void start();
    void stop();
    void getInfo();    
}

class Car implements Vehicle {
    private String fuel;
    private String color;

    public Car(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
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
        System.out.print("Car Information:\nType: Car\nFuel: "+fuel+"\nColor: "+color+"\n");
        System.out.println();
    }

}

class Motorcycle implements Vehicle {
    private String fuel;
    private String color;

    public Motorcycle(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
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
        System.out.print("Motorcycle Information:\nType: Motorcycle\nFuel: "+fuel+"\nColor: "+color+"\n");
        System.out.println();
    }

}

class Bus implements Vehicle {
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
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
        System.out.print("Information:\nType: Bus\nFuel: "+fuel+"\nCapacity: "+capacity+" passengers\n");
        System.out.println();
    }

}

public class VehicleMain1 {
    private static void VehicleAction(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        Vehicle car = new Car("Petrol","Red");
        Vehicle motorcycle = new Motorcycle("Gasoline","Black");
        Vehicle bus = new Bus("Diesel", 40);


        VehicleAction(car);
        VehicleAction(motorcycle);
        VehicleAction(bus);
    }
}