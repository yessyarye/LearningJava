package challenge;

public class Driver {
    private String driverID;
    private String name;
    private Truck assignedTruck;

    // Constructor
    public Driver(String driverID, String name) {
        this.driverID = driverID;
        this.name = name;
    }

    // Method untuk menugaskan truck ke driver
    public void assignTruck(Truck truck) {
        this.assignedTruck = truck;
        System.out.println(name + " is assigned to truck: ");
        System.out.println("Truck ID: " + truck.getTruckID());
        System.out.println("License Plate: " + truck.getLicensePlate());
        System.out.println("Current Load: " + truck.getCurrentLoad() + " tons");
        System.out.println("Capacity: " + truck.getCapacity() + " tons");
        System.out.println("Status: " + truck.getTruckStatus());
    }
}
