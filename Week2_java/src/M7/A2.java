package M7;


// Kelas Mobil
class Mobil {
    private String merek;
    private String warna;
    private int tahunPembuatan;

    // Konstruktor
    public Mobil(String merek, String warna, int tahunPembuatan) {
        this.merek = merek;
        this.warna = warna;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Getter dan Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    // Metode toString untuk output yang lebih mudah dibaca
    @Override
    public String toString() {
        return "Merek: " + merek + "\nWarna: " + warna + "\nTahun Pembuatan: " + tahunPembuatan;
    }
}

public class A2{
    public static void main(String[] args) {
        
    }
}
