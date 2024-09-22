package M7;
import java.util.*;
import java.util.Map;

public class Mape {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        //Element can transverse in any order
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+ " "+m.getValue());
        }
    }
}
