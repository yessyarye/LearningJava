package M4;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan Nama: ");
        String nm = in.next();

        System.out.print("Tanggal lahir: ");
        int tl = in.nextInt();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int Month = in.nextInt();

        // Mengonversi bulan dalam bentuk angka menjadi nama bulan
        String MonthName = "";
            if (bl == 1) {
                MonthName = "Januari";
            } else if (Month == 2) {
                MonthName = "Feb";
            } else if (Month == 3) {
                MonthName = "Maret";
            } else if (Month == 4) {
                MonthName = "April";
            } else if (Month == 5) {
                MonthName = "Mei";
            } else if (Month == 6) {
                MonthName = "Juni";
            } else if (Month == 7) {
                MonthName = "Juli";
            } else if (Month == 8) {
                MonthName = "Agustus";
            } else if (Month == 9) {
                MonthName = "September";
            } else if (Month == 10) {
                MonthName = "Oktober";
            } else if (Month == 11) {
                MonthName = "November";
            } else if (Month == 12) {
                MonthName = "Desember";
            } else {
                MonthName = "Tidak valid";
            }

        // Meminta input tahun lahir
        System.out.print("Masukkan Tahun Lahir: ");
        int th = in.nextInt();

        // Menghitung umur berdasarkan tahun ini
        int um = Year.now().getValue() - th;

        // Mendapatkan tanggal saat ini
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();

        // Mengecek apakah sudah ulang tahun atau belum
        boolean sudahUlangTahun = false;

        if (Month < currentMonth || (Month == currentMonth && tl <= currentDay)) {
            sudahUlangTahun = true;
        }

        // Jika belum ulang tahun, umur dikurangi 1
        if (!sudahUlangTahun) {
            um--;
        }

        // Menampilkan hasil
        System.out.println("Hasilnya: \nNama " + nm + " tanggal lahir " + tl + " " + MonthName + " " + th + ". Umur: " + um);

        // Mengecek apakah sudah ulang tahun atau belum dan menampilkan pesan yang sesuai
        if (sudahUlangTahun) {
            System.out.println(nm + " sudah berulang tahun tahun ini.");
        } else {
            System.out.println(nm + " belum berulang tahun tahun ini.");
        }

        in.close();
    }
}

