package Task3;

// Main
public class VehicleMain3 {
    private static void VehicleAction(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.charge();
        vehicle.getInfo();
    }

    private static void ElectricVehicleAction(ElectricVehicle electricVehicle) {
        electricVehicle.start();
        electricVehicle.stop();
        electricVehicle.charge();
        electricVehicle.getInfo();
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        Vehicle car = new Car("Petrol","Red",0);
        Vehicle motorcycle = new Motorcycle("Gasoline","Black",0);
        Vehicle bus = new Bus("Diesel","", 50);

        ElectricVehicle eCar = new ElectricCar("Electric", "white",0);
        ElectricVehicle eMotorcycle = new ElectricMotorcycle("Electric", "white",0);
        ElectricVehicle eBus = new ElectricBus("Electric", "",30);


        VehicleAction(car);
        VehicleAction(motorcycle);
        VehicleAction(bus);

        ElectricVehicleAction(eCar);
        ElectricVehicleAction(eMotorcycle);
        ElectricVehicleAction(eBus);

    }
}