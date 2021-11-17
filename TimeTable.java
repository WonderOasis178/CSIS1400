import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Time Table:");
        System.out.print("Number(1-10): ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

        in.close();
    }
}
