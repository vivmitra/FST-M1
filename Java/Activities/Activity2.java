package Test;
import java.util.*;

public class Activity2 {

    public static void main(String[] args) {

        int[] arr1 = {10, 77, 20, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(arr1));

        System.out.println("Result: " + result(arr1));

    }

    public static boolean result (int[] numbers){
                int sum=0;
                for(int number:numbers){
                    if (number==10) {
                        sum += number;
                    }
                }
        System.out.println("Sum: " + sum);
        return(sum==30);
    }
}
