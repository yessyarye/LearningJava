package M3;
public class tugas2 {
    public static void main(String[] args) {
        //deklarasi variabel
        int panjang = 12, lebar = 8, luaspersegi;
        //rumus luas persegi panjang
        luaspersegi = panjang*lebar;
        System.out.println("Soal Point 1");
        //print hasil
        System.out.println("Panjang :  "+ panjang+ ", dan lebar:  "+ lebar + "\nMaka Luasnya : " + luaspersegi);
        System.out.println("====================");

        //deklarasi variabel
        float alas=7.0f, tinggi=3.5f, luassegi3;
        //rumus luas segitiga
        luassegi3 = 0.5f * alas * tinggi;
        System.out.println("Soal Point 2");
        //print hasil
        System.out.println("Alas :  "+ alas+ ", dan Tinggi:  "+ tinggi + "\nMaka Luasnya : " + luassegi3);
        System.out.println("====================");

        System.out.println("Soal Point 3");
        System.out.println("Berdasarkan hasil dari point 1 dan 2" + "\nMaka apakah point 1>point2" + "\nHasilnya adalah " + (luaspersegi>luassegi3));
        System.out.println("====================");

        //decrement sebanyak 3 kali pada luas persegi
        --luaspersegi;
        --luaspersegi;
        --luaspersegi;
        System.out.println("Soal point 4");
        System.out.println("Setelah decrement: " + luaspersegi);

        //increment sebanyak 6x pada luas persegi
        ++luaspersegi;
        ++luaspersegi;
        ++luaspersegi;
        ++luaspersegi;
        ++luaspersegi;
        ++luaspersegi;
        System.out.println("Setelah increment: "+luaspersegi);
    }
}
