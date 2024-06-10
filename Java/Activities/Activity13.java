package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integers (Enter non integers to terminate) -");


        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer[] nums = list.toArray(new Integer[0]);
        int index =  indexGen.nextInt(nums.length);
        System.out.println("Index value: " + index);
        System.out.println("Array value at index: " + nums[index]);

        scan.close();
    }


}
