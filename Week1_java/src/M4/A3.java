package M4;

public class A3 {
    public static void main(String[] args) {
        //my
        System.out.println("Angka genap dari 1 sampai 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //devit ver.
        int range = 100;
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}