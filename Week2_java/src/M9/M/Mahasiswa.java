package M9.M;

import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public int nilai_fisika, nilai_kimia, nilai_biologi;

    // Constructor untuk menyimpan data input dari user
    Mahasiswa(String name, int nilaiFis, int nilaiKim, int nilaiBio) {
        this.nama = name; // Menyimpan nama mahasiswa
        this.nilai_fisika = nilaiFis; // Menyimpan nilai fisika mahasiswa
        this.nilai_kimia = nilaiKim; // Menyimpan nilai kimia mahasiswa
        this.nilai_biologi = nilaiBio; // Menyimpan nilai biologi mahasiswa
    }

    // Method untuk menampilkan data singkat (nama dan nilai) mahasiswa dalam satu baris
    public void printSingkat() {
        System.out.println(nama + "," + nilai_fisika + "," + nilai_kimia + "," + nilai_biologi); 
    }

    // Method untuk menampilkan data lengkap mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama); // Menampilkan nama mahasiswa
        System.out.println("Nilai Fisika: " + this.nilai_fisika); // Menampilkan nilai fisika
        System.out.println("Nilai Kimia: " + this.nilai_kimia); // Menampilkan nilai kimia
        System.out.println("Nilai Biologi: " + this.nilai_biologi); // Menampilkan nilai biologi
        double mean = (double)(nilai_fisika + nilai_kimia +  nilai_biologi) / 3; 
        // Menghitung rata-rata nilai dengan casting ke double untuk hasil desimal
        System.out.println(mean + "\n"); // Menampilkan rata-rata nilai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat scanner untuk input dari user
        Mahasiswa mhs1 = null;  // Deklarasi objek Mahasiswa untuk mahasiswa pertama
        Mahasiswa mhs2 = null;  // Deklarasi objek Mahasiswa untuk mahasiswa kedua
        int pilihan = 0;        // Variabel untuk menyimpan pilihan menu

        while (pilihan != 3) { // Loop selama pilihan bukan "Exit" (pilihan != 3)
            System.out.println("Menu");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");

            System.out.print("Input nomor: ");
            pilihan = sc.nextInt(); // Membaca input nomor menu
            sc.nextLine(); // Membersihkan input buffer

            switch (pilihan) {
                case 1:
                    // Input data mahasiswa dari user
                    System.out.println("Input Data Mahasiswa");
                    System.out.print("Input Nama: ");
                    String name = sc.nextLine(); // Membaca nama mahasiswa
                    System.out.print("Input Nilai Fisika: ");
                    int nilaiFis = sc.nextInt(); // Membaca nilai fisika
                    System.out.print("Input Nilai Kimia: ");
                    int nilaiKim = sc.nextInt(); // Membaca nilai kimia
                    System.out.print("Input Nilai Biologi: ");
                    int nilaiBio = sc.nextInt(); // Membaca nilai biologi
                    sc.nextLine(); // Membersihkan input buffer setelah input angka

                    // Membuat objek Mahasiswa berdasarkan input yang diberikan
                    if (mhs1 == null) { // Jika mahasiswa pertama belum diinput
                        mhs1 = new Mahasiswa(name, nilaiFis, nilaiKim, nilaiBio); // Inisialisasi mhs1
                        System.out.println("");
                        mhs1.printSingkat(); // Tampilkan data singkat mahasiswa pertama
                    } else {
                        // Jika mahasiswa pertama sudah diinput, maka data baru diisi ke mhs2
                        mhs2 = new Mahasiswa(name, nilaiFis, nilaiKim, nilaiBio); // Inisialisasi mhs2
                        System.out.println("");
                        mhs1.printSingkat(); // Tampilkan data singkat mahasiswa pertama
                        mhs2.printSingkat(); // Tampilkan data singkat mahasiswa kedua
                    }
                    break;

                case 2:
                    // Menampilkan data mahasiswa jika sudah diinput
                    if (mhs1 != null) { // Jika mhs1 tidak null (sudah ada data mahasiswa pertama)
                        mhs1.tampilkanInfo(); // Menampilkan data lengkap mahasiswa pertama
                    }
                    if (mhs2 != null) { // Jika mhs2 tidak null (sudah ada data mahasiswa kedua)
                        mhs2.tampilkanInfo(); // Menampilkan data lengkap mahasiswa kedua
                    }
                    break;

                case 3:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    // Jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println(); // Menambahkan spasi antar menu
        }

        sc.close(); // Menutup scanner
    }
}
