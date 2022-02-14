package main.Week_1_31_2022;

public class Heteromecic {
    public static void main(String[] args) {
        // True tests
        System.out.println("Is 110 heteromecic? " + isHeteromecic(110));
        System.out.println("Is 56 heteromecic? " + isHeteromecic(56));
        // False tests
        System.out.println("Is 133 heteromecic? " + isHeteromecic(133));
        System.out.println("Is 1 heteromecic? " + isHeteromecic(1));
    }

    static boolean isHeteromecic(int num) {
        double sqRoot = Math.sqrt(num);
        double floor = Math.floor(sqRoot);
        double ceil = Math.ceil(sqRoot);
        if(floor != ceil)
            return (num == floor * ceil);
        else
            return false;
    }
}