package GekBrains.lesson1;

public class MultiTab {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 5; j++) {
//                System.out.print(j + " * " + i + " = " + i * j + "\t");
                System.out.printf("%d * %d = %d\t\t", j, i, i*j);//System.out.printf("число %d , строка %s , дробное число %.4f", 123, "Hello, world", 123.27874515248547857);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.printf("%d * %d = %d\t\t", j, i, i*j);
            }
            System.out.println();
        }
    }
}