package Test;

public interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}


interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);

}

class Bicycle implements BicycleParts, BicycleOperations {
    int gears;
    int currentSpeed;

    public Bicycle (int gears, int speed){
        this.gears = gears;
        this.currentSpeed = speed;
    }

    public void applyBrake(int decrement){
        currentSpeed-=decrement;
        System.out.println("Slow down bicycle by " + decrement + "kmph");
        System.out.println("Current speed is " + currentSpeed + "kmph");
    }
    public void speedUp(int increment){
        currentSpeed+=increment;
        System.out.println("Speed up bicycle by " + increment + "kmph");
        System.out.println("Current speed is " + currentSpeed + "kmph");
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }

}

class MountainBike extends Bicycle{

    int seatHeight;

    public MountainBike(int gears, int speed, int height) {
        super(gears, speed);
        seatHeight = height;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return(super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }

}