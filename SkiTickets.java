
/***************************************** 
 * Author : Tiare Jorquera 
 * Date : 09/16/2021 
 * Assignment: A02 Ski Tickets 
 *****************************************/
import java.util.Scanner;

public class SkiTickets {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double adultTicket = 93.00;
        double youthTicket = 47.00;
        double totalPrice;
        int adultNum;
        int youthNum;
        String dollarSign = "$";

        System.out.print("Number of adult tickets: ");
        adultNum = Integer.parseInt(input.nextLine());

        System.out.print("Number of youth tickets: ");
        youthNum = Integer.parseInt(input.nextLine());

        System.out.print("Name: ");
        String name = input.nextLine();

        double totalAdult = adultTicket * adultNum;
        double totalYouth = youthTicket * youthNum;
        totalPrice = totalAdult + totalYouth;

        System.out.println("\n");
        System.out.println("Invoice for " + name + ":\n");
        System.out.printf("%-14s %-2d %-3s %s %.2f\n", "Adult Tickets", adultNum, "..", dollarSign, totalAdult);
        System.out.printf("%-14s %-2d %-3s %s %.2f\n", "Youth Tickets", youthNum, "..", dollarSign, totalYouth);
        System.out.printf("------------------------------\n");
        System.out.printf("%23s %.2f\n", dollarSign, totalPrice);
        System.out.printf("%30s", "========");
        input.close();

    }
}
