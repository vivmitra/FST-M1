package Test;

public class Activity7 {

    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());

        mb.setHeight(88);
        System.out.println(mb.bicycleDesc());


        mb.speedUp(10);
        mb.applyBrake(2);
    }
}
