package main.Week_1_31_2022;

public class HappyNumber {
    public static void main(String[] args) {
        // Positive tests
        System.out.println("Is 203 happy? " + isHappy(203));
        System.out.println("Is 130 happy? " + isHappy(130));
        // Negative tests
        System.out.println("Is 16 happy? " + isHappy(16));
        System.out.println("Is 69 happy? " + isHappy(69));
    }

    static boolean isHappy(int num) {
        int newNum = num;
        while(newNum != 1 && newNum != 4) {
            int manipNum = newNum;
            newNum = 0;
            while(manipNum > 0) {
                newNum += (manipNum % 10) * (manipNum % 10);
                manipNum /= 10;
            }
        }
        return newNum == 1;
    }
}
