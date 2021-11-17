public class Car {

    private String name;
    private String carColor;
    private int wheelsNum;

    public Car(String newname, String color, int wheelsNum) {
        this.name = newname;
        this.carColor = color;
        this.wheelsNum = wheelsNum;
    }

    public String getName() {
        return this.name;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public int getWheelsNum() {
        if ((wheelsNum % 2) == 0) {
            // even
            return this.wheelsNum;
        } else {
            // odd
            this.wheelsNum = 0;
            return this.wheelsNum;
        }
    }

    public void start() {
        System.out.println("Car Started!");
    }

    public static void main(String[] args) {

        Car newCar = new Car("Honda", "red", 4);

        System.out.println(newCar.getName());
        newCar.start();
        System.out.println();

        System.out.println(newCar.getName());
        System.out.println(newCar.getCarColor());
        System.out.println(newCar.getWheelsNum());
    }

}
