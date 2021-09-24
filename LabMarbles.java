import java.util.Scanner;

public class LabMarbles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Color: ");
        String color1 = input.nextLine();
        System.out.println("Number of " + color1 + " marbels: ");
        int number1 = Integer.parseInt(input.nextLine());

        System.out.println("Color: ");
        String color2 = input.nextLine();
        System.out.println("Number of " + color2 + " marbels: ");
        int number2 = Integer.parseInt(input.nextLine());

        System.out.println("Color: ");
        String color3 = input.nextLine();
        System.out.println("Number of " + color3 + " marbels: ");
        int number3 = Integer.parseInt(input.nextLine());

        System.out.println("\n\nColor     Number of marbles");
        System.out.println("--------     ---------------");
        System.out.printf("%-12s %d%n", color1, number1);
        System.out.printf("%-12s %d%n", color2, number2);
        System.out.printf("%-12s %d%n", color3, number3);
        input.close();
    }
}
