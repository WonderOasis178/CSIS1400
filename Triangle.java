/*******************************
 * Author: Tiare Jorquera Date: 10/19/2021 A05-Triangle
 ********************************/

public class Triangle {
    // Fields
    private double side1;
    private double side2;
    private double side3;

    // Constructors
    public Triangle(double side1, double side2, double side3) {
        if (isTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            this.side1 = 1d;
            this.side2 = 1d;
            this.side3 = 1d;
        }
    }

    // Methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private boolean isTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEquilateral() {
        if (side1 == side2 && side1 == side3 && side2 == side3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRight() {
        if (side3 == Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)))
                || side2 == Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side3, 2)))
                || side1 == Math.sqrt((Math.pow(side2, 2)) + (Math.pow(side3, 2)))) {
            return true;
        } else {
            return false;
        }
    }
}
