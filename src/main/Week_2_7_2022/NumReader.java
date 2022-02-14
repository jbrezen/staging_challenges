package main.Week_2_7_2022;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumReader {
    public static void main(String[] args) {
        System.out.println("3132 -> " + lookAndSay(new BigInteger("3132")));
        System.out.println("95 -> " + lookAndSay(new BigInteger("95")));
        System.out.println("120520 -> " + lookAndSay(new BigInteger("120520")));
        System.out.println("231 -> " + lookAndSay(new BigInteger("231")));
        System.out.println("1213141516171819 -> " + lookAndSay(new BigInteger("1213141516171819")));
    }

    public static BigInteger lookAndSay(BigInteger baseNum) {
        String baseStr = baseNum.toString();
        String returnString = "";
        if(baseStr.length() % 2 == 1)
            return new BigInteger("-1");

        List<String> pairs = new ArrayList<>();
        while(baseStr.length() > 0) {
            pairs.add(baseStr.substring(0,2));
            baseStr = baseStr.substring(2);
        }

        for(int i = 0; i < pairs.size(); ++i) {
            int numPrint = Character.getNumericValue(pairs.get(i).charAt(0));
            char printed = pairs.get(i).charAt(1);
            for(int j = 0; j < numPrint; ++j) {
                returnString += printed;
            }
        }

        return new BigInteger(returnString);
    }
}
