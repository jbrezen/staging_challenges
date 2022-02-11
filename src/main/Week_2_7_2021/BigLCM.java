package main.Week_2_7_2021;

import java.util.Arrays;

public class BigLCM {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int[] array2 = {46, 54, 466, 544};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array4 = {13, 6, 17, 18, 19, 20, 37};
        System.out.println("The LCM of array [5, 4, 6, 46, 54, 12, 13, 17] is " + lcmOfArray(array1));
        System.out.println("The LCM of array [46, 54, 466, 544] is " + lcmOfArray(array2));
        System.out.println("The LCM of array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] is " + lcmOfArray(array3));
        System.out.println("The LCM of array [13, 6, 17, 18, 19, 20, 37] is " + lcmOfArray(array4));
    }

    public static int lcmOfArray(int[] arr) {
        if(arr.length == 2)
            return lcm(arr[0],arr[1]);
        else if(arr.length == 1)
            return arr[0];
        else if(arr.length == 0)
            return -1;
        else {
            int newArr[] = Arrays.copyOf(arr,arr.length-1);
            return lcm(lcmOfArray(newArr),arr[arr.length-1]);
        }
    }

    public static int lcm(int a, int b) {
        int gcdA = Math.max(a,b);
        int gcdB = Math.min(a,b);
        while(gcdB != 0) {
            int temp = gcdB;
            gcdB = gcdA % gcdB;
            gcdA = temp;
        }
        return (a*b)/gcdA;
    }
}
