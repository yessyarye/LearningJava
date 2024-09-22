package M2.DriverTruck_management;

public class Driver {
    private String driverID;
    private String name;
    private Truck assignedTruck;

    public Driver(String driverID, String name){
        this.driverID = driverID;
        this.name = name;
    }

    public void assignTruck(Truck truck){
        this.assignedTruck = truck;
        System.out.println(name + " is assigned to truck "+ truck.getTruckStatus());
    }

    public String getDetails(){
        return "Driver ID: "+ driverID + "\nName: " + name + "\nAssigned truck: " + assignedTruck.getTruckStatus();
    }
}