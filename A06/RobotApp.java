/**********************************************
* Author: Tiare Jorquera
* 
* RobotApp solved three challenges where a 
* robot needs to figure out the number
* of rooms in a given grid.
***********************************************/
package A06;

public class RobotApp {
   public static void main(String[] args) {
      int n = 5;
      int h = 4;
      int w = 7;

      // square nxn grid with the robot in the north-east corner
      Robot robot = new Robot(n, n, n - 1, 0);
      challenge1(robot);

      // rectangular grid with width w and height h // robot in the north-east corner
      robot = new Robot(w, h, w - 1, 0);
      challenge2(robot);

      // square nxn grid // robot's starting position: 1 over, 2 down
      robot = new Robot(n, n, 1, 2);
      challenge3(robot);

      // rectangular grid with width w and height h // robot's starting position: 3
      // over, 1 down
      robot = new Robot(w, h, 3, 1);
      challenge4(robot);

   }

   private static void challenge1(Robot robot) {
      int n = 1;
      while (robot.check('W')) {
         robot.go('W');
         n++;
      }

      robot.say(n * n + " rooms, " + n + " moves");
   }

   private static void challenge2(Robot robot) {
      // start at north-east
      int w = 1;
      int h = 1;
      while (robot.check('S')) {
         robot.go('S');
         h++;
      }
      while (robot.check('W')) {
         robot.go('W');
         w++;
      }
      int area = h * w;
      int sum = h + w;

      robot.say(area + " rooms, " + sum + " moves");
   }

   private static void challenge3(Robot robot) {
      // square, start random
      int n = 1;
      int steps = 0;

      // go north until you cannot anymore
      while (robot.check('N')) {
         robot.go('N');
         steps++;
      }
      // go west until you cannot anymore
      while (robot.check('W')) {
         robot.go('W');
         steps++;
      }
      // you are now at the north-west corner

      while (robot.check('E')) {
         robot.go('E');
         n++;
         steps++;
      }

      robot.say(n * n + " rooms " + steps + " moves");
   }

   private static void challenge4(Robot robot) {
      // rectanlge, start random
      int w = 1;
      int h = 1;
      int steps = 0;
      int area;

      // go north until you cannot anymore
      while (robot.check('N')) {
         robot.go('N');
         steps++;
      }
      // go east until you cannot anymore
      while (robot.check('E')) {
         robot.go('E');
         steps++;
      }
      // you are now at the north-east corner

      while (robot.check('S')) {
         robot.go('S');
         h++;
         steps++;
      }
      while (robot.check('W')) {
         robot.go('W');
         w++;
         steps++;
      }
      area = h * w;

      robot.say(area + " rooms " + steps + " moves");
   }
}
