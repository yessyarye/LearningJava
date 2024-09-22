package M6;

public class Loop_array {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing elements of array: ");
        System.out.println("First Elements: " + age[0]);
        System.out.println("First Elements: " + age[1]);
        System.out.println("First Elements: " + age[2]);
        System.out.println("First Elements: " + age[3]);
        System.out.println("First Elements: " + age[4]);

        System.out.println("============================");

        System.out.println("Using for loop: ");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("============================");

        System.out.println("Using for-each loop: ");
        for (int i : age) {
            System.out.println(i);
        }

        System.out.println("============================");
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;

        //access all element using for each loop, and then add each element in sum
        for (int number : numbers) {
            sum += number;
        }

        //get the total number of elements
        int arrayLength = numbers.length;

        //calculate teh average, convert average from int to double
        average = ((double)sum) / (double)arrayLength;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
