package GekBrains.lesson2;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(123);
        list.add("hgh");
        list.add(7.7);
        list.add('t');
        list.add("hgh");

        list.remove("hgh");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
