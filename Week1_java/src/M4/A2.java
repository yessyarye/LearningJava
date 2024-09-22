package M4;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan simbol aritmatika: ");
        String sim = in.next();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        double hasil = 0;  // Inisialisasi variabel hasil dengan nilai default
        boolean validOperation = true; // untuk mengecek apakah operasi valid atau tidak

        switch (sim) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "x", "*":
                hasil = angka1 * angka2;
                break;
            case "/", ":":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Simbol aritmatika tidak valid.");
                validOperation = false;
                break;
        }

        // Cetak hasil jika operasi valid
        if (validOperation) {
            System.out.println(angka1 + " " + sim + " " + angka2 + " = " + hasil);
        }

        in.close();
    }
}
