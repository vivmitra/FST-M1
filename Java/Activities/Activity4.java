package Test;

import java.util.Arrays;

public class Activity4 {

    static void insertionSort(int[] num1){

        int size=num1.length;
        int i,j,x;

        for(i=1; i<size; i++){
            x=num1[i];
            j=i-1;

            while (j >= 0 && x < num1[j]) {
                num1[j + 1] = num1[j];
                --j;
            }
            num1[j + 1] = x;

        }

    }

    public static void main(String[] args) {
        int[] num = {10,2,1,2,20,21,0,4,99};

        System.out.print("Array before sorting:   ");
        System.out.println(Arrays.toString(num));

        insertionSort(num);

        System.out.print("Array after sorting:   ");
        System.out.println(Arrays.toString(num));

    }
}
