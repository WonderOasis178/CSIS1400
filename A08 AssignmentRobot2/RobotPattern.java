/*************************************************
 * Author: Tiare Jorquera
 * 
 * RobotPattern solved three challenges where a robot walks specified patterns
 * in ramdom-sized grids.
 *
 * Important: The code still needs to work when you change the value of the
 * variable n
 *************************************************/

public class RobotPattern {
   public static void main(String[] args) {
      int n = 6;

      // square nxn grid with the robot in the north east corner
      Robot robot = new Robot(n, n, n - 1, 0);
      challenge1(robot);

      robot = new Robot(n, n, n - 1, 0);
      challenge2(robot);

      robot = new Robot(n, n, n - 1, 0);
      challenge3(robot);
   }

   private static void challenge1(Robot robot) {
      int n = 1;

      while (robot.check('s')) {
         robot.go('s');
         n++;
      }
      robot.say("done");
   }

   private static void challenge2(Robot robot) {
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
      robot.say("did it");
   }

   private static void challenge3(Robot robot) {
      int n = 1;
      int numOfSteps = 0;

      while (robot.check('N')) {
         robot.go('N');
         numOfSteps++;
      }
      while (robot.check('E')) {
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
