package LabLineDrawing;

//package used to create graphics
import java.awt.*;
//package used to create line
import java.awt.geom.Line2D;
//package used to create frame
import javax.swing.JFrame;

// Create class Point
class Point {
    // Declare variables
    private double x;
    private double y;

    // Parameterized constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Returns the points as string
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}

// Create class Line
class Line {

    // initialize point class
    Point start, end;

    // Parametized constructor
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return start.toString() + "," + end.toString();
    }
}

// Create class LineDrawing
class LineDrawing extends JFrame {
    // Declare Graphics2D
    static Graphics2D g2d;

    // Draw a triangle
    public static void drawTriangle(Graphics g) {
        // initialize Graphics2D
        g2d = (Graphics2D) g;

        // initialize point class
        Point p1 = new Point(100, 100);
        Point p2 = new Point(150, 50);
        Point p3 = new Point(200, 100);

        // initialize line class
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p1, p3);
        Line line3 = new Line(p2, p3);

        // Draw lines
        g2d.draw(new Line2D.Double(line1.start.getX(), line1.start.getY(), line1.end.getX(), line1.end.getY()));
        g2d.draw(new Line2D.Double(line2.start.getX(), line2.start.getY(), line2.end.getX(), line2.end.getY()));
        g2d.draw(new Line2D.Double(line3.start.getX(), line3.start.getY(), line3.end.getX(), line3.end.getY()));

    }

    // Draw a House
    public static void drawHouse(Graphics g) {
        Point p1 = new Point(350, 50);
        Point p2 = new Point(300, 100);
        Point p3 = new Point(400, 100);
        Point p4 = new Point(300, 200);
        Point p5 = new Point(400, 200);
        Point p6 = new Point(330, 150);
        Point p7 = new Point(330, 200);
        Point p8 = new Point(370, 150);
        Point p9 = new Point(370, 200);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p1, p3);
        Line line3 = new Line(p2, p3);
        Line line4 = new Line(p2, p4);
        Line line5 = new Line(p3, p5);
        Line line6 = new Line(p4, p5);
        Line line7 = new Line(p6, p7);
        Line line8 = new Line(p6, p8);
        Line line9 = new Line(p8, p9);

        g2d.draw(new Line2D.Double(line1.start.getX(), line1.start.getY(), line1.end.getX(), line1.end.getY()));
        g2d.draw(new Line2D.Double(line2.start.getX(), line2.start.getY(), line2.end.getX(), line2.end.getY()));
        g2d.draw(new Line2D.Double(line3.start.getX(), line3.start.getY(), line3.end.getX(), line3.end.getY()));
        g2d.draw(new Line2D.Double(line4.start.getX(), line4.start.getY(), line4.end.getX(), line4.end.getY()));
        g2d.draw(new Line2D.Double(line5.start.getX(), line5.start.getY(), line5.end.getX(), line5.end.getY()));
        g2d.draw(new Line2D.Double(line6.start.getX(), line6.start.getY(), line6.end.getX(), line6.end.getY()));
        g2d.draw(new Line2D.Double(line7.start.getX(), line7.start.getY(), line7.end.getX(), line7.end.getY()));
        g2d.draw(new Line2D.Double(line8.start.getX(), line8.start.getY(), line8.end.getX(), line8.end.getY()));
        g2d.draw(new Line2D.Double(line9.start.getX(), line9.start.getY(), line9.end.getX(), line9.end.getY()));
    }

    // Draw random Lines
    public static void drawRandomLines(Graphics g) {
        g2d = (Graphics2D) g;

        Point p1 = new Point(0, 220);
        Point p2 = new Point(500, 220);

        Line line1 = new Line(p1, p2);

        // Draw line to separate the triangle, house, and random lines
        // g2d.draw(new Line2D.Double(line1.start.getX(), line1.start.getX(),
        // line1.end.getX(), line1.end.getY()));

        // iterate 10 times
        for (int i = 0; i < 10; i++) {
            // generate the random points
            double x1 = Math.random() * 500;
            double y1 = Math.random() * 700;

            if (y1 <= 220) {
                y1 = y1 + 220;
            }

            double x2 = Math.random() * 500;
            double y2 = Math.random() * 700;

            if (y2 <= 220) {
                y2 = y2 + 220;
            }

            Point p3 = new Point(x1, y1);
            Point p4 = new Point(x2, y2);

            Line line = new Line(p3, p4);

            // draw random line
            g2d.draw(new Line2D.Double(line.start.getX(), line.start.getY(), line.end.getX(), line.end.getY()));
        }
    }
}

public class LineDrawingApp extends JFrame {
    // default constructor
    LineDrawingApp() {
        super("Line Drawing App");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Draw triangle, house, and random lines
    @Override
    public void paint(Graphics g) {
        LineDrawing ld = new LineDrawing();
        ld.drawTriangle(g);
        ld.drawHouse(g);
        ld.drawRandomLines(g);
    }

    public static void main(String[] args) {
        // initialize class
        LineDrawingApp lda = new LineDrawingApp();
    }
}
