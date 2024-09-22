package M4;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n Menu");
            System.out.println("1. Cetak menu 1");
            System.out.println("2. Cetak menu 2");
            System.out.println("3. Cetak menu 3");
            System.out.println("4. Exit");
            System.out.print("Input nomor = ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Menu 1");
                    break;
                case 2:
                    System.out.println("Menu 2");
                    break;
                case 3:
                    System.out.println("Menu 3");
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Angka yg kamu masukkan tidak ada di menu");
            }
        }while(pilih !=4);
        System.out.println("<Program Exited>");
        sc.close();
    }
}

/* public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            // Menampilkan menu
            System.out.println("\n===== Menu =====");
            System.out.println("1. Cetak menu 1");
            System.out.println("2. Cetak menu 2");
            System.out.println("3. Cetak menu 3");
            System.out.println("4. Exit");
            System.out.print("Input nomor = ");

            // Membaca input pengguna
            if (sc.hasNextInt()) { // Memastikan input adalah integer
                pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Menu 1");
                        break;
                    case 2:
                        System.out.println("Menu 2");
                        break;
                    case 3:
                        System.out.println("Menu 3");
                        break;
                    case 4:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Angka yang kamu masukkan tidak ada di menu, silakan coba lagi.");
                        break;
                }
            } else {
                // Jika input bukan angka
                System.out.println("Input harus berupa angka.");
                sc.next(); // Membersihkan input yang salah
                pilih = 0; // Menjaga agar loop tetap berjalan
            }

        } while (pilih != 4); // Berhenti jika pilihan adalah 4 (Exit)
        System.out.println("<Program Exited>");
        sc.close();
    }
}
*/