
/***************************************
* Author: Tiare Jorquera
* Date: 09/23/2021
* Assignment: A03 - Sorting 3 Numbers
***************************************/
import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        // Read in three whole numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers seperataed by a space: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        // sort numbers in ascending order
        int min, max, med;
        if (n1 > n2) {
            if (n1 > n3) {
                max = n1;
                if (n2 > n3) {
                    med = n2;
                    min = n3;
                } else {
                    med = n3;
                    min = n2;
                }
            } else {
                med = n1;
                if (n2 > n3) {
                    max = n2;
                    min = n3;
                } else {
                    max = n3;
                    min = n2;
                }
            }
        } else {
            if (n2 > n3) {
                max = n2;
                if (n1 > n3) {
                    med = n1;
                    min = n3;
                } else {
                    med = n3;
                    min = n1;
                }
            } else {
                med = n2;
                max = n3;
                min = n1;

            }
        }
        System.out.printf("Sorted numbers: %d %d %d%n", min, med, max);

        input.close();
    }

}
