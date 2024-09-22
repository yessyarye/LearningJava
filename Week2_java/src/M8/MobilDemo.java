package M8;

public class MobilDemo {
  public static void main(String[] args) {
    // Inisialisasi object Mobil tanpa input user
    Mobil mobil = new Mobil("Toyota Camry", "Hitam");

    // Menampilkan informasi mobil
    mobil.info();

    // Menjalankan mobil
    mobil.berjalan();

    // Menghentikan mobil
    mobil.berhenti();
  }
}
