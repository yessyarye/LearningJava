package M7;
import java.util.ArrayList;
import java.util.Scanner;

class Mobil {
    private String merek;
    private String warna;
    private int tahunPembuatan;

    public Mobil(String merek, String warna, int tahunPembuatan) {
        this.merek = merek;
        this.warna = warna;
        this.tahunPembuatan = tahunPembuatan;
    }

    @Override
    public String toString() {
        return "Merek: " + merek + ", Warna: " + warna + ", Tahun Pembuatan: " + tahunPembuatan;
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih metode penyimpanan data mobil:");
        System.out.println("1. Array");
        System.out.println("2. ArrayList (Collection)");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer

        if (pilihan == 1) {
            // Menggunakan Array
            System.out.print("Berapa mobil yang ingin Anda input? ");
            int jumlahMobil = scanner.nextInt();
            scanner.nextLine();  // membersihkan buffer

            Mobil[] daftarMobil = new Mobil[jumlahMobil];  // Ukuran tetap, harus ditentukan

            for (int i = 0; i < jumlahMobil; i++) {
                System.out.println("Input mobil ke-" + (i + 1));
                System.out.print("Merek: ");
                String merek = scanner.nextLine();
                System.out.print("Warna: ");
                String warna = scanner.nextLine();
                System.out.print("Tahun Pembuatan: ");
                int tahunPembuatan = scanner.nextInt();
                scanner.nextLine();  // membersihkan buffer

                daftarMobil[i] = new Mobil(merek, warna, tahunPembuatan);
            }

            System.out.println("\nDaftar Mobil (Array):");
            for (Mobil mobil : daftarMobil) {
                System.out.println(mobil);
               
            }
            System.out.println("(Array):\n" + //
                                "Program meminta input jumlah mobil di awal, sehingga kita perlu membuat array dengan ukuran tetap.\n" + //
                                "Setelah ukuran array ditentukan, kita tidak bisa menambah atau mengurangi elemen dalam array tersebut.");

        } else if (pilihan == 2) {
            // Menggunakan ArrayList (Collection)
            ArrayList<Mobil> daftarMobil = new ArrayList<>();  // Ukuran dinamis, bisa bertambah

            String lanjutInput = "y";
            while (lanjutInput.equalsIgnoreCase("y")) {
                System.out.println("Input data mobil baru");
                System.out.print("Merek: ");
                String merek = scanner.nextLine();
                System.out.print("Warna: ");
                String warna = scanner.nextLine();
                System.out.print("Tahun Pembuatan: ");
                int tahunPembuatan = scanner.nextInt();
                scanner.nextLine();  // membersihkan buffer

                // Tambahkan mobil ke daftar
                daftarMobil.add(new Mobil(merek, warna, tahunPembuatan));

                System.out.print("Ingin menambahkan mobil lagi? (y/n): ");
                lanjutInput = scanner.nextLine();
            }

            // Menampilkan daftar mobil
            System.out.println("\nDaftar Mobil (ArrayList):");
            for (Mobil mobil : daftarMobil) {
                System.out.println(mobil);
            }
            System.out.println(" (ArrayList):\n" + //
                                "Tidak perlu menentukan ukuran array di awal. ArrayList bisa bertambah dinamis sesuai dengan input dari pengguna.\n" + //
                                "Kita bisa menambah elemen kapan saja tanpa khawatir dengan batasan ukuran.");

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
