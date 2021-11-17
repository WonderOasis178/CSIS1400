
/**************************
    Assignment: A09 - Dice
    Author: Tiare Jorquera
***************************/
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        // variable declaration
        int dice1;
        int dice2;

        // array to hold the frequency of the sum appeared
        int[] sumArray = new int[11];

        for (int i = 0; i < 36000; i++) {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            sumArray[dice1 + dice2 - 2]++;
        }
        System.out.printf("Sum  Frequency  Percentage%n");

        double percentage = 0f;
        for (int i = 0; i < sumArray.length; i++) {
            percentage = (Float.valueOf(sumArray[i]) * 100) / 36000;
            System.out.printf("%3d%11d%11.1f%s", i + 2, sumArray[i], percentage, "%");
            System.out.println();
        }
    }

}