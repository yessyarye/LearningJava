package M6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int a = in.nextInt();  // Menyimpan jumlah elemen array

        // Membuat array dengan ukuran yang ditentukan oleh pengguna
        int[] array = new int[a];

        // Loop untuk mengisi array dengan input dari pengguna
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan elemen ke-" + (i) + ": ");
            array[i] = in.nextInt(); // Memasukkan nilai elemen ke dalam array
        }

        // Implementasi algoritma Bubble Sort untuk mengurutkan array
        for (int i = 0; i < array.length; i++) {
            // Setiap iterasi membandingkan elemen berurutan dan menukarnya jika tidak dalam urutan yang benar
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar posisi
                if (array[j + 1] < array[j]) {
                    int temp = array[j]; // Simpan elemen array[j] ke variabel sementara
                    array[j] = array[j + 1]; // Pindahkan array[j+1] ke array[j]
                    array[j + 1] = temp; // Pindahkan nilai sementara ke array[j+1]
                }
            }
        }

        // Menampilkan array yang sudah diurutkan
        System.out.println("Array setelah diurutkan: ");
        for (int i = 0; i < array.length; i++) {
            // Menampilkan elemen array satu per satu
            System.out.print(array[i]);
            // Menambahkan koma antara elemen-elemen kecuali setelah elemen terakhir
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
        
        // Menutup Scanner setelah penggunaan selesai
        in.close();
    }
}
