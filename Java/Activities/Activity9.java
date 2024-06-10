package Test;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Ram");
        myList.add("Shyam");
        myList.add("Robert");
        myList.add(3, "Vikram");
        myList.add(1, "Vivek");

        System.out.println("Current List: ");
        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println("3rd name: " + myList.get(2));
        System.out.println("Is Vikram present: " + myList.contains("Vikram"));
        System.out.println("Is Ramesh present: " + myList.contains("Ramesh"));
        System.out.println("Is Shyam present: " + myList.contains("Shyam"));
        System.out.println("List size: " + myList.size());

        myList.remove("Robert");

        System.out.println("Updated List size: " + myList.size());

        System.out.println("Current List: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }




}
