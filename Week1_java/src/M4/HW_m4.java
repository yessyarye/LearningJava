package M4;

import java.util.Scanner;
import java.time.Year;

public class HW_m4 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel yang digunakan dalam program
        int pilih, angka1, angka2, angka3, hasil;  // Variabel untuk menyimpan input dan hasil integer
        double hasilbola, jari2;  // Variabel untuk menyimpan hasil perhitungan volume bola dan jari-jari
        final double pi = 3.14;  // Deklarasi konstanta pi

        do {
            // Menampilkan menu utama program
            System.out.println("\n===== Menu =====");
            System.out.println("1. Volume Balok");
            System.out.println("2. Volume Bola");
            System.out.println("3. Hitung Umur");
            System.out.println("4. Exit");
            System.out.print("Input nomor = ");

            // Mengecek apakah input dari pengguna adalah angka integer
            if (sc.hasNextInt()) {  // Memastikan input berupa integer
                pilih = sc.nextInt();  // Menyimpan pilihan pengguna

                switch (pilih) {  // Menjalankan menu sesuai dengan pilihan pengguna
                    case 1:
                        // Menu 1: Menghitung volume balok
                        System.out.println("Menu: Volume Balok");
                        System.out.print("Masukkan Panjang = ");
                        angka1 = sc.nextInt();  // Input panjang balok
                        System.out.print("Masukkan Lebar = ");
                        angka2 = sc.nextInt();  // Input lebar balok
                        System.out.print("Masukkan Tinggi = ");
                        angka3 = sc.nextInt();  // Input tinggi balok
                        hasil = angka1 * angka2 * angka3;  // Menghitung volume balok
                        System.out.println("Maka Volume Balok = " + hasil);  // Menampilkan hasil perhitungan
                        break;
                    case 2:
                        // Menu 2: Menghitung volume bola
                        System.out.println("Menu: Volume Bola");
                        System.out.print("Masukkan Jari-jari = ");
                        jari2 = sc.nextDouble();  // Input jari-jari bola
                        hasilbola = (4.0 / 3.0) * pi * Math.pow(jari2, 3);  // Menghitung volume bola (4/3 * pi * r^3)
                        System.out.println("Maka Volume Bola = " + hasilbola);  // Menampilkan hasil perhitungan
                        break;
                    case 3:
                        // Menu 3: Menghitung umur berdasarkan tahun lahir
                        System.out.println("Menu: Hitung Umur");
                        System.out.print("Masukkan Tahun Lahir = ");
                        angka1 = sc.nextInt();  // Input tahun lahir
                        hasil = Year.now().getValue() - angka1;  // Menghitung umur (tahun sekarang - tahun lahir)
                        System.out.println("Maka umur sekarang adalah " + hasil);  // Menampilkan umur
                        break;
                    case 4:
                        // Menu 4: Keluar dari program
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        // Jika pengguna memasukkan pilihan yang tidak valid
                        System.out.println("Angka yang kamu masukkan tidak ada di menu, silakan coba lagi.");
                        break;
                }
            } else {
                // Jika input yang dimasukkan bukan angka
                System.out.println("Input harus berupa angka.");
                sc.next();  // Mengabaikan input yang salah
                pilih = 0;  // Menjaga agar program tetap berlanjut
            }

        } while (pilih != 4);  // Program akan terus berjalan hingga pengguna memilih opsi 4 (Exit)
        
        System.out.println("<Program Exited>"); 
        sc.close();
    }
}