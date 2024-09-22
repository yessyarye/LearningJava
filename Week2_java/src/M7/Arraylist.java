package M7;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist <> diamond operator
        list.add("Ravi");// Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Suno");
        list2.add("Hanumat");

        list.addAll(list2);
        // print satu baris \
        System.out.println("List = " + list);
        // Traversing list through Iterator
        Iterator<String> itr = list.iterator(); // dari variabel + method
        while (itr.hasNext()) {
            System.out.println("Nama: " + itr.next());
        }
        System.out.println("========For each========");
        // Menampilkan dengan for each
        for (String nama : list) {
            System.out.println("Nama: " + nama);
        }

    }
}
