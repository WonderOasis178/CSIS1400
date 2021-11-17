/*****************************************
 * Author : Tiare Jorquera 
 * Date : 10/07/2021 
 * Assignment: A04
 ******************************************/
package Conveyor;

public class Conveyor {

    // Fields
    private String type;
    private double speed; // Speed is measured in m/s

    // Constructors
    public Conveyor(String type, double speed) {
        this.type = type;
        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    // Methods
    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public double timeToTransport(double distance) {
        return distance / speed;
    }

}
