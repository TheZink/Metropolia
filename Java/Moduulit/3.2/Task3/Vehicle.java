package Task3;

interface Vehicle {
    void start();
    void stop();
    void charge();    
    void getInfo();
}

class Car extends AbstractVehicle {
    public Car(String fuel, String color, int capacity) {
        super(fuel,color,capacity);
    }
  
    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }

    public void charge(){
        super.charge();
    }

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
