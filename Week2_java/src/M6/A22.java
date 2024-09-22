package M6;
import java.util.Arrays;
import java.util.Scanner;

public class A22 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Baris Array Integer = ");
        int baris = input.nextInt();
        System.out.print("Kolom Array Integer = ");
        int kolom = input.nextInt();

        // create an array
        int[][] arrayInteger = new int[baris][kolom];

        // input array
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print("Index["+i+"]["+j+"] = ");
                arrayInteger[i][j] = input.nextInt();
            }
        }

        System.out.println("Kolom dan Baris Array 2 Dimensi adalah ["+baris+","+kolom+"]");
        System.out.println("Array Multidimensi 2 Dimensi");

        // display array with for loop
        for (int i = 0; i < arrayInteger.length; ++i) {
            for(int j = 0; j < arrayInteger[i].length; ++j) {
                System.out.print(arrayInteger[i][j] + " ");
            }
            System.out.println();
        }
        /* 
        // display with for each
        for (int[] arrayBaris: arrayInteger) {
            for (int item: arrayBaris) {
                System.out.print(item + " ");
            } 
            System.out.println();   
        }*/

        // display array with string
        String result = Arrays.deepToString(arrayInteger);
        System.out.println("Array string: " + result);
        input.close();
    }
}
