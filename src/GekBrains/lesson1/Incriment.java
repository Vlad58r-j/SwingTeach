package GekBrains.lesson1;

public class Incriment {
    public static void main(String[] args) {
        //        int a = ++d + d++;
        int c;
        c = 2;
        int a;
        a = 0;
        c = c + 1;
        a = c;
        a = a + c;
        c = c + 1;
        System.out.println(a);//6
        insert();
    }

    public static void insert() {
        int d = 3;
//        int sum = d++ + ++d;
        int sum;
        sum = 0;
        d = d + 1;
        d = d + 1;
        sum = d + sum;
        System.out.println(sum);//5
    }
}
