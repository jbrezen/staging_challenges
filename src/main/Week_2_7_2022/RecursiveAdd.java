package main.Week_2_7_2022;

import java.util.Arrays;

public class RecursiveAdd {
    public static void main(String[] args) {
        System.out.println("The sum of [1,2,3,4,5] is: " + sum(new int[] {1,2,3,4,5})); //15
        System.out.println("The sum of [2,4,6,8] is: " + sum(new int[] {2,4,6,8})); //20
    }

    static int sum(int[] arr) {
        if(arr.length == 0)
            return 0;
        int[] newArr = Arrays.copyOf(arr,arr.length-1);
        return sum(newArr) + arr[arr.length-1];
    }
}
