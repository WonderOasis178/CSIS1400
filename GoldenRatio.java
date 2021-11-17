import java.util.Scanner;

public class GoldenRatio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input A: ");
        float number1 = Float.parseFloat(input.nextLine());

        System.out.println("Input B: ");
        float number2 = Float.parseFloat(input.nextLine());

        System.out.printf("isGoldenRatio(%.3f,%.3f): %b%n", number1, number2, isGoldenRatio(number1, number2));

        input.close();
    }

    public static boolean isGoldenRatio(float num1, float num2) {
        // Swapping the numbers such
        // that num1 contains the maximum
        // number between these numbers
        if (num1 <= num2) {
            float temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // First Ratio
        String ratio1 = String.format("%.3f", num1 / num2);

        // Second Ratio
        String ratio2 = String.format("%.3f", (num1 + num2) / num1);

        if (ratio1.equals(ratio2) && ratio1.equals("1.618")) {
            return true;
        } else {
            return false;
        }

    }
}
