/*************************************************
 * Author: Tiare Jorquera
 * 
 * RobotPattern solved three challenges where a robot walks specified patterns
 * in ramdom-sized grids.
 *
 * Important: The code still needs to work when you change the value of the
 * variable n
 *************************************************/
package A08;

public class RobotPattern {
   public static void main(String[] args) {
      int n = 6;

      // square nxn grid with the robot in the north east corner
      // challenge one DONE!!!!!
      // Robot robot = new Robot(n, n, n - 1, 0);
      // challenge1(robot);

      // challenge 2 **-- In Process --**
      Robot robot = new Robot(n, n, n - 1, 0);
      challenge2(robot);

      // challenge 3 **-- TO BE WORKED ON --**
      // robot = new Robot(n, n, n - 1, 0);
      // challenge3(robot);
   }

   private static void challenge1(Robot robot) {
      int n = 1;
      do {
         while (robot.check('w')) {
            robot.go('w');
            n++;
         }
         if (robot.check("s") == true) {
            robot.go('s');
         }

         while (robot.check('e')) {
            robot.go('e');
            n++;
         }
         if (robot.check("s") == true) {
            robot.go('s');
         }
      } while (robot.check("s") != false);

      robot.say("done");
   }

   private static void challenge2(Robot robot) {
      int n = 1;

      while (robot.check('S') == true) {
         robot.go('S');
         n++;
      }

      while (robot.check('W') == true) {
         robot.go('W');
         n++;
      }

      while (robot.check('n') == true) {
         robot.go('n');
         n++;
      }

      while (robot.check('e')) {
         robot.go('e');
         n++;
      }

      robot.say("did it");
   }

   private static void challenge3(Robot robot) {
      int n = 1;
      int numOfSteps = 0;

      if (robot.check('N')) {
         robot.go('N');
         numOfSteps++;
      }
      if (robot.check('E')) {
         robot.go('E');
         numOfSteps++;
      }

      while (robot.check('S')) {
         robot.go('S');
         n++;
      }
      robot.say("finished");

   }

}
