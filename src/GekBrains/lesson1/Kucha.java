package GekBrains.lesson1;

import java.util.Arrays;

public class Kucha {
    public static void main(String[] args) {
        Dog dog;
        IfCase ifCase;

        int stable[];//Так называется наше стойло, но оно пока не построено, стойло-stable
//        num = {2, 23, 34, 2};/Tак не работает.Фигурные скобки в жизни массива используются один раз
        stable = new int[10];//Построили стойло для лощадей на 100 персон
//        for (int i : num) {
//            System.out.println(i);
//        }
        stable[0] = 1;
        stable[3] = 2;
        stable[2] = 9;
        System.out.println(Arrays.toString(stable));
//        num[12] = 10;

//        String pig[] = {"\n", "hello", "\n"};
//        System.out.println(Arrays.toString(pig));
    }
}
