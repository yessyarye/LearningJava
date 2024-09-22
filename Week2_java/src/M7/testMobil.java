package M7;
import java.util.ArrayList;
import java.util.List;
public class testMobil {

    public static void main(String[] args) {
        // deklarasi list mobil
        List<Mobil> daftarMobil = new ArrayList<>();

        // inisasi mobil
        Mobil mobil1 = new Mobil("Toyota", 
            "Hitam", 1999);
        Mobil mobil2 = new Mobil("Aplhard", 
            "Putih", 2011);
        Mobil mobil3 = new Mobil("Porsche", 
            "Kuning", 2010);

        // masukkan di array list
        daftarMobil.add(mobil1);            
        daftarMobil.add(mobil2);            
        daftarMobil.add(mobil3);            

        // tampilkan for each
        for (Mobil mobil:daftarMobil) {
            System.out.println(mobil.toString());
            System.out.println();
        }
    }
    
}
