package M6;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int a = in.nextInt();  // Menyimpan jumlah elemen dalam array

        // Membuat array dengan ukuran yang ditentukan oleh pengguna
        int[] array = new int[a];

        // Loop untuk mengisi array dengan input dari pengguna
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan elemen ke-" + (i) + ": ");
            array[i] = in.nextInt(); // Memasukkan nilai elemen ke dalam array
        }

        // Meminta pengguna memasukkan elemen yang akan dicari
        int target;
        System.out.println("Masukkan elemen yang akan dicari: ");
        target = in.nextInt();  // Menyimpan nilai target yang dicari

        // Deklarasi variabel untuk implementasi binary search
        int left = 0;  // Batas kiri
        int middle;  // Elemen tengah
        int right = array.length - 1;  // Batas kanan

        // Proses pencarian menggunakan algoritma binary search
        while (left <= right) {
            // Menentukan indeks elemen tengah
            middle = (left + right) / 2;

            // Jika elemen tengah sama dengan target, cetak indeks dan hentikan pencarian
            if (array[middle] == target) {
                System.out.println("Elemen ditemukan pada indeks: " + middle);
                break;
            } 
            // Jika elemen tengah lebih kecil dari target, ubah batas kiri
            else if (array[middle] < target) {
                left = middle + 1;
            } 
            // Jika elemen tengah lebih besar dari target, ubah batas kanan
            else {
                right = middle - 1;
            }
        }

        // Jika elemen tidak ditemukan, cetak pesan
        if (left > right) {
            System.out.println("Elemen tidak ditemukan");
        }

        // Menutup Scanner setelah penggunaan selesai
        in.close();
    }
}
