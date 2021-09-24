package LabBall;

public class Ball {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double Size) {
        if (Size >= 0) {
            size = Size;
        } else {
            System.out.println("Invalid input, please restart program.");
        }
    }

    public void roll() {
        System.out.println("rolling...");
    }

    public void bounce(int bouncing) {
        System.out.printf("bouncing %d times%n", bouncing);
    }

}
