package M6;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan banyaknya elemen array
        System.out.print("Masukkan jumlah baris array: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom array: ");
        int kolom = sc.nextInt();

        // Mendeklarasikan array dengan ukuran yang dimasukkan oleh pengguna
        int[][] array = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan index [" + i + "]" + "[" + j + "]" + ": ");
                array[i][j] = sc.nextInt(); // Memasukkan input ke dalam array

            }
        }
        System.out.println("Baris dan kolom Array 2 Dimensi adalah [" + baris + "," + kolom + "]");
        System.out.println("Array Multidimensi 2 Dimensi ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Mencetak elemen di baris i
                System.out.print(array[i][j] + " ");
            }
            // Pindah ke baris baru setelah selesai mencetak 1 baris
            System.out.println();
        }
    }
}