import java.util.Scanner;

public class LabWhile {
    public static void main(String[] args) {
        multiplyNumbers();
    }

    public static void multiplyNumbers() {
        int product = 1;

        // object of scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.print("Enter a number (0 to quit): ");
        int number = input.nextInt();

        // while loop continues until the user inputs 0 to exit
        while (number != 0) {
            product *= number;
            System.out.printf("The value of the product is now %d%n", product);
            System.out.print("Enter a number (0 to quit): ");
            number = input.nextInt();
        }
        System.out.printf("The value of the product is %d", product);
        input.close();
    }
}
