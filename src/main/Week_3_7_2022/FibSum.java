package main.Week_3_7_2022;

import java.util.ArrayList;
import java.util.List;

public class FibSum {
    public static void main(String[] args) {
        List<Integer> seq = new ArrayList<>();
        seq.add(1);
        seq.add(2);
        int nextNum = 0;
        int size;
        while(nextNum < 4000000) {
            size = seq.size();
            nextNum = seq.get(size-1) + seq.get(size-2);
            seq.add(nextNum);
        }

        int finalSum = 0;
        // Parity sum rules dictate that exactly every third entry is even
        for(int i = 1; i < seq.size(); i += 3) {
            finalSum += seq.get(i);
        }

        System.out.println("Sum of even Fibonacci numbers below 4 million is: " + finalSum);
    }
}
