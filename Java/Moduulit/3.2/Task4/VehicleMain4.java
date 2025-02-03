package Task4;

// Main
public class VehicleMain4 {
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

        Vehicle car = new Car("Car","Petrol","Red",0,4.5);
        Vehicle motorcycle = new Motorcycle("Motorcycle","Gasoline","Black",0,3.0);
        Vehicle bus = new Bus("Bus","Diesel","", 50,8.0);

        ElectricVehicle eCar = new ElectricCar("eCar","Electric", "white",0,4);
        ElectricVehicle eMotorcycle = new ElectricMotorcycle("eMotorcycle","Electric", "white",0,2);
        ElectricVehicle eBus = new ElectricBus("eBus","Electric", "",30,10);


        VehicleAction(car);
        VehicleAction(motorcycle);
        VehicleAction(bus);

        ElectricVehicleAction(eCar);
        ElectricVehicleAction(eMotorcycle);
        ElectricVehicleAction(eBus);

    }
}