package M4;

public class if_else {
    public static void main(String[] args) {
        int number = 0;
        // cek if number is greater than 0
        if (number > 0) {
            System.out.println("The number id positive");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is 0.");
        }
    }
}