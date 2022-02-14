package main.Week_2_14_2022;

public class RealMemory {
    public static void main(String[] args) {
        System.out.println("The true memory of a 32GB system is " + trueMem("32GB"));
        System.out.println("The true memory of a 2GB system is " + trueMem("2GB"));
        System.out.println("The true memory of a 512MB system is " + trueMem("512MB"));
        System.out.println("The true memory of a 1GB system is " + trueMem("1GB"));
    }
    static String trueMem(String labelMem) {
        String valStr = labelMem.substring(0,labelMem.length()-2);
        String units = labelMem.substring(labelMem.length()-2);
        double val = Double.parseDouble(valStr);
        val *= 0.93;

        if(units.equals("GB") && val >= 1) {
            String toReturn = String.format("%.2f",val);
            toReturn += "GB";
            return toReturn;
        }
        else if(units.equals("MB") || (units.equals("GB") && val < 1)) {
            if(val < 1)
                val *= 1000;
            String toReturn = String.format("%.0f",val);
            toReturn += "MB";
            return toReturn;
        }
        else
            return "";
    }
}
