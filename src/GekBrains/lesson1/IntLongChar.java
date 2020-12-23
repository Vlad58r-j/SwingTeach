package GekBrains.lesson1;

public class IntLongChar {
    public static void main(String[] args) {
//        Примитивные типы
        byte s = 127;//Самая маленькая база данных
        System.out.println(Byte.MAX_VALUE);
        System.out.println(s);

        short h = 32767;//Среднее между byte и int база данных
        System.out.println(Short.MAX_VALUE);
        System.out.println(h);

        int i = 2147483647;//Самая часто изпользуемая база данных. Используется по умолчанию
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i);

        long e = 9223372036854775807L;//Самое большая база данных
        System.out.println(Long.MAX_VALUE);
        System.out.println(e);

        char f = 12345;//Символ, так же вместо числа можно указать символ в '' кавычках. В "" выдаст ошибку!!!!
        System.out.println(f);
        System.out.println(f);

        String g = "Hello";
        System.out.println(g);

        boolean c = false;
        System.out.println(c);

        double m = 12.4;
        System.out.println(Double.MAX_VALUE);
        System.out.println(m);

        float x = 122.4444444f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(x);
    }
}
