package M3;

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        // Membaca panjang balok dari pengguna, lalu disimpan di variabel p
        System.out.print("Masukkan Panjang balok: ");
        int p = input.nextInt();
        // Membaca lebar balok dari pengguna, lalu disimpan di variabel l
        System.out.print("Masukkan Lebar balok: ");
        int l = input.nextInt();
        // Membaca tinggi balok dari pengguna, lalu disimpan di variabel t
        System.out.print("Masukkan Tinggi balok: ");
        int t = input.nextInt();
        // Menghitung dan menampilkan volume balok
        System.out.println("Maka volume Balok adalah " + (p * l * t));
        System.out.println("==============================\n");

        // Menghitung volume bola
        final double pi = 3.14; // Mendefinisikan nilai konstanta pi
        // Membaca jari=jari bola dari pengguna, lalu disimpan di variabel j
        System.out.print("Masukkan Jari-jari Bola: ");
        int j = input.nextInt();
        // Menghitung dan menampilkan volume bola
        System.out.println("Maka volume Bola adalah " + ((4.0 / 3.0) * pi * (j * j * j)));

        // Menutup objek Scanner untuk menghindari kebocoran memori
        input.close();
    }
}