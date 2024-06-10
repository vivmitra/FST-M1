package Test;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Ram");
        hs.add("Mohan");
        hs.add("K");
        hs.add("5");
        hs.add("Viru");
        hs.add("Mohan5");

        System.out.println("Original Set: " + hs);
        System.out.println("Size of Set: " + hs.size());

        System.out.println("5 removed from the Set: "+ hs.remove("5"));
        if(hs.remove("Z")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }

        System.out.println("Is Mohan present: " + hs.contains("Mohan"));
        System.out.println("Is 5 present: " + hs.contains("5"));

        System.out.println("Updated Set: " + hs);


    }
}
