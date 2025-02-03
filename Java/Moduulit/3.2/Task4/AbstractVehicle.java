package Task4;

// Abstrakti
abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    protected String type;
    protected String fuel;
    protected String color;
    protected int capacity;
    protected double fuelConsume;

    public AbstractVehicle(String type, String fuel, String color, int capacity, double fuelConsume) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.capacity = capacity;
        this.fuelConsume = fuelConsume;
    }

    @Override
    public void start(){
        System.out.println(type + " is starting");
    }

    @Override
    public void stop(){
        System.out.println(type + " is stopping");
    }

    @Override 
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public void getInfo() {
        System.out.println(type + " information:");
        System.out.println("Fuel: "+ fuel);
        if (color != "") { System.out.println("Color: "+color); } // Tulostetaan, jos parametreissa on asetettu väri
        if (capacity != 0) { System.out.println("Capacity: " + capacity); } // Palautetaan, jos parametreissa on asetettu määrä
    }

    public double calculateFuelEfficiency(){
        return 0;
    };


}

