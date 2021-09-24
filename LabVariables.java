import java.util.Scanner;

public class LabVariables {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String destination;
    System.out.print("Please enter your favorite destination: ");
    destination = input.nextLine();
    System.out.printf("Welcome to %s%n%n", destination);

    int kingsPeak = 4124;
    int timpanogos = 3581;
    System.out.println("");
    System.out.printf("Elevation of King Peak: %d%n", kingsPeak);
    System.out.printf("Elevation of Timpanogos: %d%n", timpanogos);
    input.close();
  }
}