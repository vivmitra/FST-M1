package Test;

import java.util.HashMap;

public class Activity11 {

    public static void main(String[] args) {

        HashMap<Integer, String> colours = new HashMap<>();

        colours.put(1, "red");
        colours.put(3, "green");
        colours.put(2, "orange");
        colours.put(3, "yellow");
        colours.put(4, "blue");
        colours.put(5, "red");
        colours.put(6, "black");

        System.out.println("Original Map: " + colours);
        System.out.println("Original size: " + colours.size());

        System.out.println("Removing orange with correct key: " + colours.remove(2, "orange"));
        System.out.println("Removing violet with correct key: " + colours.remove(6, "violet"));
        System.out.println("Removing black with incorrect key: " + colours.remove(3, "black"));

        System.out.println("Is green present in Map?- " + colours.containsValue("green"));
        System.out.println("Is key 5 present in Map?- " + colours.containsKey(5));

        System.out.println("Updated size: " + colours.size());
        System.out.println("Updated Map: " + colours);
    }
}
