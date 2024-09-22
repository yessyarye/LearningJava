package Exam;

public class Truck {
    private String truckID; // ID unik truck
    private String licensePlate; // Nomor plat truck
    private double capacity; // Kapasitas maksimum truck
    private double currentLoad; // Muatan yang sedang dibawa (def 0)

    // Constructor
    public Truck(String truckID, String licensePlate, double capacity) {
        if (truckID == null || truckID.isEmpty()) {
            System.out.println("Error: truckID tidak boleh null atau kosong.");
        }
        if (licensePlate == null || licensePlate.isEmpty()) {
            System.out.println("Error: licensePlate tidak boleh null atau kosong.");
        }
        if (capacity <= 0) {
            System.out.println("Error: Kapasitas tidak boleh kurang atau sama dengan nol.");
        }

        this.truckID = truckID;
        this.licensePlate = licensePlate;
        this.capacity = capacity > 0 ? capacity : 0; // kalo capacity negatif, atur ke 0
        this.currentLoad = 0; // Def 0
    }

    // Method untuk menambahkan muatan ke truck
    public void addCargo(double weight) {
        if (weight <= 0) {
            System.out.println("Error: Berat muatan yang ditambahkan harus lebih dari nol.");
            return;
        }
        if (currentLoad + weight > capacity) {
            System.out.println("Error: Muatan melebihi kapasitas truck.");
            return;
        }
        currentLoad += weight;
        System.out.println(
                "Success: " + weight + " ton beban sudah ditambahkan. Beban sekarang: " + currentLoad + " ton.");
    }

    // Method untuk mengurangi muatan dari truck
    public void removeCargo(double weight) {
        if (weight <= 0) {
            System.out.println("Error: Berat muatan yang dihapus harus lebih dari nol.");
            return;
        }
        if (currentLoad - weight < 0) {
            System.out.println("Error: Muatan tidak bisa dikurangi sehingga kurang dari nol.");
            return;
        }
        currentLoad -= weight;
        System.out.println("Success: " + weight + " ton beban sudah dikurangi. Beban sekarang: " + currentLoad + " ton.");
    }

    // Method untuk menampilkan status truck
    public String getTruckStatus() {
        if (currentLoad == 0) {
            return "Empty";
        } else if (currentLoad == capacity) {
            return "Fully loaded";
        } else {
            return "Partially loaded";
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

    public String getCurrentLoad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentLoad'");
    }
}
