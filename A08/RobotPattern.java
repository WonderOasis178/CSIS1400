package A08;

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
      // challenge one Done
      // Robot robot = new Robot(n, n, n - 1, 0);
      // challenge1(robot);

      // challenge 2 **-- Done --**
      //Robot robot = new Robot(n, n, n - 1, 0);
      //challenge2(robot);

      // challenge 3 **-- Working on it --**
       Robot robot = new Robot(n, n, n - 1, 0);
       challenge3(robot);
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
      int n = 0;
      int i = 0;
      int k = 0;

      do {
         if (n > 0) {
            k -= 2;

         }
         i = 0;

         while (robot.check("s") && (n == 0 || k == 0 || i <= k)) {
            robot.go("s");
            n++;
            i++;
         }


         if (k == 0) {
          k = i;
         }
         else {
           k = i - 1;
         }

           i = 0;
         while (robot.check("w") && (n == 0 || i < k)) {
          robot.go("w");
           n++;
           i++;
           }

           i = 0;
           while (robot.check("n") && (n == 0 || i < k)) {
           robot.go("n");
           n++;
           i++;
           }

           i = 0;
           while (robot.check("e") && (n == 0 || i < k - 1)) {
           robot.go("e");
           n++;
           i++;
           }
           i = 0;

      } while (k > 0);

      robot.say("did it");
   }

   private static void challenge3(Robot robot) {
      int n = 0;
      int i = 0;
      int k = 0;

      do {
         if (n > 0) {
            k -= 2;
         }
         i = 0;

         while (robot.check('s') && (n == 0 || k == 0 || i <= k)) {
            robot.go('s');
            n++;
            i++;
         }

         if (k == 0) {
            k = i;
         } else {
            k = i - 1;
         }

         while (robot.check('w') && (n == 0 || i < k)) {
            robot.go('w');
            n++;
            i++;
         }
         i = 0;
         robot.go('n');

         while (robot.check('e') && (n == 0 || i < k - 1)) {
            robot.go('e');
            n++;
            i++;
         }
         i = 0;

      } while (k > 0);

      robot.say("finished");

   }

}
