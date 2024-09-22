package Exam;
public class Driver {
    private String driverID; // ID unik driver
    private String name; // Nama driver
    private Truck assignedTruck; // Truck yang ditugaskan ke driver

    // Constructor
    public Driver(String driverID, String name) {
        this.driverID = driverID;
        this.name = name;
        this.assignedTruck = null; // Def tidak ada truck yang ditugaskan
    }

    // Method untuk menugaskan truck ke driver
    public void assignTruck(Truck truck) {
        if (truck == null) {
            System.out.println("Error: Truck tidak boleh null.");
            return;
        }
        this.assignedTruck = truck;
        System.out.println(name + " is assigned to truck "+ truck.getTruckID());
    }

    // Method untuk menampilkan informasi driver dan truck
    public String getDetails() {
        if (assignedTruck == null) {
            return "Driver: " + name + " (ID: " + driverID + ") tidak ada truck yang ditugaskan.";
        } else {
            return "Driver: " + name + " (ID: " + driverID + "), Truck: " + assignedTruck.getTruckID();
        }
    }
}
