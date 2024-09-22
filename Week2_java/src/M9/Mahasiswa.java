package M9;
//A1
import java.util.Scanner;

class Mahasiswa {
    // Deklarasi variabel untuk menyimpan informasi mahasiswa
    public String nama;
    public String jurusan;
    public int nilai_fisika, nilai_kimia, nilai_biologi;

    // Konstruktor tanpa parameter (default constructor)
    Mahasiswa(){ 
    }

    // Konstruktor dengan 2 parameter (nama dan jurusan)
    Mahasiswa(String name, String jurusan) {
        // Secara eksplisit, nilai default diberikan untuk nama dan jurusan
        this.nama = "Steve"; // Nama mahasiswa selalu di-set sebagai "Steve"
        this.jurusan = "IT"; // Jurusan mahasiswa selalu di-set sebagai "IT"
    }

    // Konstruktor dengan 5 parameter (nama, jurusan, dan nilai mata pelajaran)
    Mahasiswa(String name, String jurusan, int nilai_fisika, int nilai_kimia, int nilai_biologi) {
        // Data yang diberikan oleh user diabaikan, dan nilai default digunakan
        nama = "Steve"; // Nama mahasiswa di-set sebagai "Steve"
        this.jurusan = "IT"; // Jurusan mahasiswa di-set sebagai "IT"
        this.nilai_fisika = 7; // Nilai fisika di-set default ke 7
        this.nilai_kimia = 8;  // Nilai kimia di-set default ke 8
        this.nilai_biologi = 9; // Nilai biologi di-set default ke 9
    }

    // Main program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Membuat scanner untuk input dari user
        Mahasiswa mhs1 = new Mahasiswa(); // Membuat objek mhs1 menggunakan konstruktor tanpa parameter
        Mahasiswa mhs2 = new Mahasiswa(null, null); // Membuat objek mhs2 menggunakan konstruktor dengan 2 parameter, namun nilai yang dikirimkan adalah null
        Mahasiswa mhs3 = new Mahasiswa(null, null, 0, 0, 0); // Membuat objek mhs3 menggunakan konstruktor dengan 5 parameter, tetapi mengirimkan nilai kosong atau nol
        int pilihan = 0; // Variabel untuk menyimpan input pilihan dari user

        // Menampilkan menu pilihan kepada user
        System.out.println("Menu");
        System.out.println("1. Konstruktor tanpa parameter");
        System.out.println("2. Konstruktor dengan 2 parameter");
        System.out.println("3. Konstruktor dengan 5 parameter");
        System.out.println("4. Exit"); 
        
        // Loop yang berjalan sampai user memilih untuk keluar (pilihan 4)
        while (pilihan != 4) {
            System.out.print("Input nomor : ");
            pilihan = sc.nextInt(); // Membaca input dari user
            sc.nextLine(); // Membersihkan buffer input setelah membaca angka

            switch (pilihan) {
                case 1:
                    // Tampilkan data dari mhs1 yang dibuat dengan konstruktor tanpa parameter
                    System.out.println("Konstruktor tanpa parameter");
                    System.out.println(mhs1.nama + " " + mhs1.jurusan); // Nama dan jurusan akan null karena tidak diinisialisasi
                    System.out.println(mhs1.nilai_biologi + " " + mhs1.nilai_fisika + " " + mhs1.nilai_kimia); // Nilai mata pelajaran juga akan default 0 (karena tipe int default 0)
                    break;

                case 2:
                    // Tampilkan data dari mhs2 yang dibuat dengan konstruktor 2 parameter
                    System.out.println("Konstruktor dengan 2 parameter");
                    System.out.println(mhs2.nama + " " + mhs2.jurusan); // Nama dan jurusan akan selalu "Steve" dan "IT" karena inisialisasi di konstruktor
                    System.out.println(mhs2.nilai_biologi + " " + mhs2.nilai_fisika + " " + mhs2.nilai_kimia); // Nilai mata pelajaran akan 0 karena tidak diinisialisasi
                    break;

                case 3:
                    // Tampilkan data dari mhs3 yang dibuat dengan konstruktor 5 parameter
                    System.out.println("Konstruktor dengan 5 parameter");
                    System.out.println(mhs3.nama + " " + mhs3.jurusan); // Nama dan jurusan juga selalu "Steve" dan "IT"
                    System.out.println(mhs3.nilai_fisika + " " + mhs3.nilai_kimia + " " + mhs3.nilai_biologi); // Nilai akan selalu 7, 8, 9, meskipun input yang diberikan berbeda
                    break;

                case 4:
                    // Mengakhiri program jika user memilih opsi "4"
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    // Menampilkan pesan kesalahan jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println(); // Memberikan spasi setelah setiap iterasi
        }

        sc.close(); // Menutup scanner setelah program selesai digunakan
    }
}
