package M7;

import java.util.ArrayList;
import java.util.Scanner;

//class Mobil {
    String merek;
    String warna;
    int tahunPembuatan;

    // Constructor
    Mobil(String merek, String warna, int tahunPembuatan) {
        this.merek = merek;
        this.warna = warna;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Method untuk menampilkan informasi mobil yang sudah dimasukkan ke ArrayList
    public void displayMobil() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
    }


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mobil> listMobil = new ArrayList<>(); // Membuat ArrayList untuk menyimpan inputan objek Mobil
        int pilihan = 0;

        // Menggunakan while untuk looping
        while (pilihan != 3) {
            System.out.println("Menu");
            System.out.println("1. Insert Object (Scanner) and Assign to Array List");
            System.out.println("2. Tampilkan Array List");
            System.out.println("3. Exit");
            System.out.print("Input : ");
            pilihan = sc.nextInt();
            sc.nextLine(); //newline setelah input int

            switch (pilihan) {
                case 1:
                    // Input data mobil
                    System.out.print("Input Merek : ");
                    String merek = sc.nextLine();
                    System.out.print("Input Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Input Tahun Pembuatan : ");
                    int tahun = sc.nextInt();

                    // Membuat objek Mobil dan menambahkannya ke ArrayList
                    Mobil mobilBaru = new Mobil(merek, warna, tahun);
                    listMobil.add(mobilBaru);
                    break;

                case 2:
                    // Menampilkan data mobil dari ArrayList
                    if (listMobil.isEmpty()) {
                        System.out.println("Array List kosong!");
                    } else {
                        for (Mobil mobil : listMobil) {
                            mobil.displayMobil();
                            System.out.println(); 
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }
}
