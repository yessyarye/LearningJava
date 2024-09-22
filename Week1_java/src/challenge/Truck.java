package challenge;

public class Truck {
    private String truckID;
    private String licensePlate;
    private double capacity;
    private double currentLoad;

    // Constructor
    public Truck(String truckID, String licensePlate, double capacity) {
        this.truckID = truckID;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.currentLoad = 0; // Inisialisasi muatan awal adalah 0
    }

    // Method untuk menambahkan muatan ke truck
    public void addCargo(double weight) {
        if (currentLoad + weight > capacity) {
            System.out.println("Muatan melebihi kapasitas.");
        } else {
            currentLoad += weight;
            System.out.println("Muatan berhasil ditambahkan.");
        }
    }

    // Method untuk mengurangi muatan dari truck
    public void removeCargo(double weight) {
        if (currentLoad - weight < 0) {
            System.out.println("Muatan tidak cukup untuk dikurangi.");
        } else {
            currentLoad -= weight;
            System.out.println("Muatan berhasil dikurangi.");
        }
    }

    // Getter untuk mendapatkan kapasitas truck
    public double getCapacity() {
        return capacity;
    }

    // Getter untuk mendapatkan ID truck
    public String getTruckID() {
        return truckID;
    }

    // Getter untuk mendapatkan nomor plat truck
    public String getLicensePlate() {
        return licensePlate;
    }

    // Getter untuk mendapatkan muatan saat ini (currentLoad)
    public double getCurrentLoad() {
        return currentLoad;
    }

    // Method untuk menampilkan status truck
    public String getTruckStatus() {
        if (currentLoad == 0) {
            return "empty";
        } else if (currentLoad == capacity) {
            return "fully loaded";
        } else {
            return "partially loaded";
        }
    }
}
