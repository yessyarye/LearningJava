package M2.DriverTruck_management;

public class Truck{
    private String truckID;
    private String licensePlate;
    private double capacity;
    private double currentLoad;

    public Truck(String truckID, String licensePlate, double capacity){
        this.truckID = truckID;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public void addLoad(double weight){
        //currentLoad = currentLoad + weight itu sama aja kyk dibawah
        currentLoad += weight;
        System.out.println(weight + " ton beban sudah ditambahkan. Beban sekarang: " + currentLoad + " ton.");
    }

    public void removeLoad(double weight){
        currentLoad -= weight;
        System.out.println(weight + " ton beban sudah dikurangi. Beban sekarang: "+currentLoad + " ton.");
    }

    public String getTruckStatus(){
        return "Truck ID: "+ truckID +"\nLicense Plate: " + licensePlate + "\nCurrent Load: " + currentLoad + "ton \n Capacity: " + capacity + " ton";
    }
}