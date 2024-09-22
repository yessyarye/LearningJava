package M7;
public class Mobil {
    String merek;
    String warna;
    int tahunPembuatan;

    public Mobil(String merek, String warna, int tahunPembuatan) {
        this.merek = merek;
        this.warna = warna;
        this.tahunPembuatan = tahunPembuatan;
    }

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

    // toString
    @Override
    public String toString() {
        return "Merek: " + merek + "\nWarna: " + warna 
            + "\nTahun pembuatan: " + tahunPembuatan;
    }
}
