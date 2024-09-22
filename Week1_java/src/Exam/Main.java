package Exam;
public class Main {
    public static void main(String[] args) {
        // Membuat beberapa truck
        Truck truck1 = new Truck("TRK001", "ABC123", 8.0);
        Truck truck2 = new Truck("TRK002", "XYZ789", 12.0);
        Truck truck3 = new Truck("", "", 12.0); // Akan memunculkan pesan error karena truckID dan licensePlate kosong
        Truck truck4 = new Truck(null, null, 12.0); // Akan memunculkan pesan error karena truckID dan licensePlate null

        // Membuat beberapa driver
        Driver driver1 = new Driver("DRV001", "John Doe");
        Driver driver2 = new Driver("DRV002", "Jane Smith");
        
        // Menugaskan truck ke driver
        System.out.println("\nPenugasan truck ke driver:");
        driver1.assignTruck(truck1);
        driver2.assignTruck(truck2);
       

        // Simulasi penambahan dan pengurangan muatan
        System.out.println("\nMenampilkan penambahan dan pengurangan pada truck 1:");
        truck1.addCargo(3.5);  // Menambahkan 3.5 ton ke truck1
        truck1.addCargo(0);  // Tidak bisa menambahkan 0 ton ke truck1
        truck1.addCargo(1000);  // Tidak bisa menambahkan 1000 ton ke truck1 (melebihi kapasitas)
        truck1.removeCargo(2.0);  // Mengurangi 2 ton dari truck1
        truck1.removeCargo(100.0);  // Tidak bisa mengurangi 100 ton dari truck1 (kurang dari nol)

        // Menampilkan status truck
        System.out.println("\nStatus truck 1\n" + truck1.getTruckStatus());
        System.out.println("\nStatus truck 2\n" + truck2.getTruckStatus());
    }
}