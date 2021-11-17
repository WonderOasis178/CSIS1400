import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LabPartyGuests {

    public static void main(String[] args) {
        int numberOfGuests = 4;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> guestList = new ArrayList<String>(); // creates the array for the list of guest

        // request for user to enter the name of the 4 guests attending
        System.out.printf("Please enter %d guests:%n", numberOfGuests);

        // input from user to enter the name of each guest
        for (int i = 0; i < numberOfGuests; i++) {
            System.out.printf("guest%d: ", i + 1);
            guestList.add(input.nextLine());
        }
        // prints the list of guest
        System.out.printf("%nGuest List: %s", guestList);
        System.out.println();

        // Randomly generates a name can't come form the List
        int randomGuest = random.nextInt(4);
        System.out.println(guestList.get(randomGuest) + " can't come");

        // removes that guest from the List
        guestList.remove(randomGuest);

        // prints updated guest list
        System.out.println("Updated guest list: " + guestList);
        input.close();
    }
}