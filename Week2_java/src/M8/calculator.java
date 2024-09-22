package M8;

import java.util.Scanner;

public class calculator {
    
    // Method untuk penjumlahan
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method untuk pengurangan
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method untuk perkalian
    public int square(int num1, int num2) {
        return num1 * num2;
    }

    // Method untuk pembagian
    public double divide(double num1, double num2) {
        // Memastikan tidak terjadi pembagian dengan nol
        if (num2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return num1 / num2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator(); // Membuat objek calculator
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("Menu");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
            System.out.print("Input nomor : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            int num1, num2;
            int result;
            double result2;

            switch (pilihan) {
                case 1:
                    // Penjumlahan
                    System.out.print("Bilangan 1 = ");
                    num1 = sc.nextInt();
                    System.out.print("Bilangan 2 = ");
                    num2 = sc.nextInt();
                    result = calc.add(num1, num2);
                    System.out.println("Pertambahan = " + result);
                    break;

                case 2:
                    // Pengurangan
                    System.out.print("Bilangan 1 = ");
                    num1 = sc.nextInt();
                    System.out.print("Bilangan 2 = ");
                    num2 = sc.nextInt();
                    result = calc.subtract(num1, num2);
                    System.out.println("Pengurangan = " + result);
                    break;

                case 3:
                    // Perkalian
                    System.out.print("Bilangan 1 = ");
                    num1 = sc.nextInt();
                    System.out.print("Bilangan 2 = ");
                    num2 = sc.nextInt();
                    result = calc.square(num1, num2);
                    System.out.println("Perkalian = " + result);
                    break;

                case 4:
                    // Pembagian
                    System.out.print("Bilangan 1 = ");
                    double num1d = sc.nextDouble(); // Menggunakan double untuk pembagian
                    System.out.print("Bilangan 2 = ");
                    double num2d = sc.nextDouble();
                    result2 = calc.divide(num1d, num2d);
                    if (num2d != 0) { // Cek pembagian dengan nol
                        System.out.println("Pembagian = " + result2);
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println(); // Spasi
        }

        sc.close();
    }
}

