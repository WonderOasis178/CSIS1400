/**********************************************
 * Author: Your Name
 *
 * Assignment Volumes calculates the volumes of various shapes.
 ***********************************************/
package A07;

public class Volumes {

   public static double cuboid(double sideA, double sideB, double sideC) {
      // Calculate volume of a cube - height*width*length
      return sideA * sideB * sideC;
   }

   public static double cuboid(double side) {
      return cuboid(side, side, side);
   }

   public static double ellipsoid(double sideA, double sideB, double sideC) {
      return (4.0 / 3.0) * Math.PI * sideA * sideB * sideC;
   }

   public static double ellipsoid(double side) {
      return ellipsoid(side, side, side);
   }

   public static double cylinder(double radius, double height) {
      return Math.PI * Math.pow(radius, 2.0) * height;
   }

   public static double cone(double diameter, double side) {
      double radius = diameter / 2.0;
      double height = Math.sqrt((Math.pow(side, 2.0)) - Math.pow(radius, 2.0));
      return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2.0) * height;
   }
}