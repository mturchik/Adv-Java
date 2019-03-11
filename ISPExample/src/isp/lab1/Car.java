package isp.lab1;

public class Car implements Workable {
    private String vinNumber;
    private String make;
    private String model;
    private int speed;
    private int miles;
    private boolean started;

    public Car(String vinNumber, String make, String model, int miles) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.speed = 0;
        this.miles = miles;
        started=false;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void accelerate() {
        if (started) {
            speed+=5;
        }
        else {
            System.out.println("Car is not running.");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", miles=" + miles +
                '}';
    }


    @Override
    public void talk(String s) {

    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void start() {
        started=true;
        accelerate();
    }

    @Override
    public void drive(int distance) {
        if (started) {
            miles+=distance;
        }
        else {
            System.out.println("Car is not running.");
        }
    }

    @Override
    public void stopByBreaking() {
        if (started) {
            speed=0;
        }
        else {
            System.out.println("Car is not running.");
        }
    }

    @Override
    public void jump() {

    }

    @Override
    public void hike() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void trip() {

    }
}
