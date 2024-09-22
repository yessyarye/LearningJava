package M8;
public class Mobil {
    private String merek;
    private String warna;
    private boolean status;

    // Constructor untuk menginisialisasi merek dan warna
    public Mobil(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
        this.status = false; // default status berhenti
    }

    // Method untuk menampilkan informasi mobil
    public void info() {
        System.out.println("Merek Mobil : " + merek);
        System.out.println("Warna Mobil : " + warna);
    }

    // Method untuk menjalankan mobil
    public void berjalan() {
        status = true;
        System.out.println(merek + " warna " + warna + " sedang berjalan (" + status + ")");
    }

    // Method untuk menghentikan mobil
    public void berhenti() {
        status = false;
        System.out.println(merek + " warna " + warna + " sedang berhenti (" + status + ")");
    }
}
