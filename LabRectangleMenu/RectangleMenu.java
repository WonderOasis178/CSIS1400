package LabRectangleMenu;

import java.util.Scanner;

public class RectangleMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle myRectangle = new Rectangle(5, 4);
		int selection;

		do {
			menuPrompt();
			selection = input.nextInt();

			switch (selection) {
			case 1:
				System.out.printf("The area of the rectangle is = %d%n%n", myRectangle.area());
				break;
			case 2:
				System.out.printf("The perimeter of the rectangle is = %d%n%n", myRectangle.perimeter());

				break;
			case 3:
				System.out.printf("The length and with of the rectangle is = %d and %d%n%n", myRectangle.getLength(),
						myRectangle.getWidth());

				break;
			case 0:
				System.out.println("Good bye\n");
				break;

			default:
				System.out.println("Invalid output\n");
				break;
			}
		} while (selection != 0);
		input.close();
	}

	private static void menuPrompt() {
		System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}