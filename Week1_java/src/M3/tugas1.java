package M3;

public class tugas1 {
    public static void main(String[] args) throws Exception {
        //tipe data boolean true/false, default: false
        String boldText = "\033[1mBoolean\033[0m"; //print bold text untuk nama tipe data
        boolean flag = true;
        System.out.println(boldText + "\n" +flag);
        
        //tipe data byte, def: 0
        String boldText2 = "\033[1mByte\033[0m";
        byte range;
        range = 120;
        System.out.println(boldText2 +"\n" + range);

        //tipe data short, def=0
        String boldText3 = "\033[1mShort\033[0m";
        short temprature;
        temprature = 240;
        System.out.println(boldText3 + "\n" + temprature);

        //int
        String boldText4 = "\033[1mInteger\033[0m";
        int range2 = 2000;
        System.out.println(boldText4 + "\n" + range2);

        //long
        String boldText5 = "\033[1mLong\033[0m";
        //ditambahka L untuk membedakan Long dengan Int
        long range3 = 10000L;
        System.out.println(boldText5 + "\n" + range3);

        //double
        String boldText6 = "\033[1mDouble\033[0m";
        double num = 64.64;
        System.out.println(boldText6 +"\n" + num);

        //float
        String boldText7 = "\033[1mFloat\033[0m";
        //ditambahkan akhir f untuk membedakan float dengan double
        float number = 16.16f;
        System.out.println(boldText7+"\n"+number);

        //char
        String boldText8 = "\033[1mChar\033[0m";
        char letter2 = 'Z';
        System.out.println(boldText8+"\n"+letter2);

        //String
        String boldText9 = "\033[1mString\033[0m";
        String myString = "TIA Academy";
        System.out.println(boldText9 + "\n" +myString);
    }
}
