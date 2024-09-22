package M2.DriverTruck_management;

public class main {
    public static void main(String[] args) {
    // Membuat beberapa truck
    Truck truck1 = new Truck("TRK001", "ABC123", 8.0);
    Truck truck2 = new Truck("TRK002", "XYZ789", 12.0);

    // Membuat beberapa driver
    Driver driver1 = new Driver("DRV001", "John Doe");
    Driver driver2 = new Driver("DRV002", "Jane Smith");

    // Menugaskan truck ke driver
    driver1.assignTruck(truck1);
    driver2.assignTruck(truck2);

    // Simulasi penambahan dan pengurangan muatan
    truck1.addLoad(3.5);  // Menambahkan 3.5 ton ke truck1
    truck1.removeLoad(2.0);  // Mengurangi 2 ton dari truck1

    // Menampilkan status truck
    System.out.println(truck1.getTruckStatus());
    System.out.println(truck2.getTruckStatus());
    }
}