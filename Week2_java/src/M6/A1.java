package M6;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan banyaknya elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int bnykElemen = sc.nextInt();

        // Mendeklarasikan array dengan ukuran yang dimasukkan oleh pengguna
        int[] array = new int[bnykElemen];
        for (int i = 0; i < bnykElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
            array[i] = sc.nextInt(); // Memasukkan input ke dalam array
        }

        // Print isi array setelah semua elemen diisi
        System.out.println("Panjang array Integer adalah: " +bnykElemen);

        System.out.print("Array Integer [ ");
        for (int i = 0; i < bnykElemen ; i++) {
            // Cetak elemen array
            System.out.print(array[i] + " ");
            /* 
             Tambahkan koma kecuali untuk elemen terakhir
         if (i < bnykElemen - 1) {
                System.out.print(", ");
            }*/   
        }
        System.out.println(" ]");
        sc.close();
    }
}
