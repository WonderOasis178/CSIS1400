/*****************************************
 * Author : Tiare Jorquera 
 * Date : 10/07/2021 
 * Assignment: A04
 ******************************************/
package Conveyor;

public class ConveyorApp {
        public static void main(String[] args) {

                // Create two conveyors
                Conveyor myConveyor1 = new Conveyor("flat belt", 0.9);
                System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s %n", myConveyor1.getType(),
                                myConveyor1.getSpeed());

                System.out.printf("Time to transport an item 50 m: %.1f %n", myConveyor1.timeToTransport(50));
                System.out.println();

                Conveyor myConveyor2 = new Conveyor("roller", -0.5);
                System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s %n", myConveyor2.getType(),
                                myConveyor2.getSpeed());

                System.out.printf("Time to transport an item 50 m: %.1f %n", myConveyor2.timeToTransport(50));
                System.out.println();

                System.out.println("...updating speed");
                System.out.println();

                // Update Speed
                myConveyor1.setSpeed(-3);
                System.out.printf("Conveyor1 %s conveyor with a speed of %.1fm/s %n", myConveyor1.getType(),
                                myConveyor1.getSpeed());
                System.out.printf("Time to transport an item 50 m: %.1f %n", myConveyor1.timeToTransport(50));
                System.out.println();

                myConveyor2.setSpeed(0.4);
                System.out.printf("Conveyor2 %s conveyor with a speed of %.1fm/s %n", myConveyor2.getType(),
                                myConveyor2.getSpeed());
                System.out.printf("Time to transport an item 50 m: %.1f %n", myConveyor2.timeToTransport(50));
                System.out.println();
        }
}
