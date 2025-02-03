package Task3;

// Abstrakti
abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    protected String fuel;
    protected String color;
    protected int capacity;

    public AbstractVehicle(String fuel, String color, int capacity) {
        this.fuel = fuel;
        this.color = color;
        this.capacity = capacity;
    }

    @Override 
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public void getInfo() {
        System.out.println("Fuel: "+ fuel);
        if (color != "") { System.out.println("Color: "+color + "\n"); } 
        if (capacity != (0)) { System.out.println("Capacity: " + capacity + "\n"); }
    }
}

