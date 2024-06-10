package Test;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException{


        Plane plane = new Plane(10);

        //Onboarding passengers
        plane.onboard("Ram");
        plane.onboard("Mohan");
        plane.onboard("Shyam");
        plane.onboard("Manoj");
        plane.onboard("Vikram");

        //Plane taking off
        System.out.println("Plane took off at: " + plane.takeOff());

        //List of passengers onboard
        System.out.println("Passenger List flying: " + plane.getPassengers());

        //Sleep for 10 secs
        Thread.sleep(5000);

        //land the plane
        plane.land();

        //Date of landing
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

        //List of passengers after offboarding
        System.out.println("Passenger List after landing: " + plane.getPassengers());

    }


}
