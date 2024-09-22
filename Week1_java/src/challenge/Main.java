package challenge;

import java.util.Scanner;
import Exam.Truck;
import Exam.Driver;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data truck
        System.out.print("Masukkan ID Truck: ");
        String truckID = sc.nextLine();
        System.out.print("Masukkan Plat Nomor Truck: ");
        String licensePlate = sc.nextLine();
        System.out.print("Masukkan Kapasitas Truck (dalam ton): ");
        double capacity = sc.nextDouble();

        // Membuat object Truck
        Truck truck = new Truck(truckID, licensePlate, capacity);

        // Menu
        int pilihan;
        do {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Tambah muatan");
            System.out.println("2. Kurangi muatan");
            System.out.println("3. Tugaskan driver ke truck");
            System.out.println("4. Tampilkan status truck");
            System.out.println("5. Exit");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang ditambahkan (dalam ton): ");
                    double tambahMuatan = sc.nextDouble();
                    truck.addCargo(tambahMuatan);
                    break;

                case 2:
                    System.out.print("Masukkan berat muatan yang dikurangi (dalam ton): ");
                    double kurangiMuatan = sc.nextDouble();
                    truck.removeCargo(kurangiMuatan);
                    break;

                case 3:
                    sc.nextLine();  // membersihkan input
                    System.out.print("Masukkan ID Driver: ");
                    String driverID = sc.nextLine();
                    System.out.print("Masukkan Nama Driver: ");
                    String driverName = sc.nextLine();

                    // Membuat object Driver dan menugaskan truck ke driver
                    Driver driver = new Driver(driverID, driverName);
                    driver.assignTruck(truck);
                    break;

                case 4:
                    System.out.println("\nStatus Truck:");
                    System.out.println("Truck ID: " + truck.getTruckID());
                    System.out.println("License Plate: " + truck.getLicensePlate());
                    System.out.println("Current Load: " + truck.getCurrentLoad() + " tons");
                    System.out.println("Capacity: " + truck.getCapacity() + " tons");
                    System.out.println("Status: " + truck.getTruckStatus());
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        sc.close();
    }
}
