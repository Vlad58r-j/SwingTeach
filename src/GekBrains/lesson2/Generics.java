package GekBrains.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(123);

        list.remove("hgh");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}

