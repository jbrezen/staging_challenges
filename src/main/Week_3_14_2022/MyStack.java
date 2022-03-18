package main.Week_3_14_2022;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T extends Comparable<T> > {
    List<T> underList;

    public MyStack() {
        underList = new ArrayList<>();
    }

    public void add(T val) {
        underList.add(val);
    }

    public T pop() throws IndexOutOfBoundsException {
        if(underList.isEmpty())
            throw new IndexOutOfBoundsException();
        int last = underList.size()-1;
        return underList.remove(last);
    }

    public T max() throws IndexOutOfBoundsException {
        if(underList.isEmpty())
            throw new IndexOutOfBoundsException();
        T max = underList.get(0);
        for (T temp : underList) {
            if (temp.compareTo(max) > 0)
                max = temp;
        }
        return max;
    }
}
