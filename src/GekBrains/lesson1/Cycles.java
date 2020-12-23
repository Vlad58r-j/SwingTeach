package GekBrains.lesson1;

public class Cycles {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 2) {
            System.out.println("No");
            a++;
        }
        clop();
        car();
    }

    public static void clop() {
        for (int c = 1; c <= 5; c++) {
            System.out.println(c);
        }
        for (int h = 1; h < 2; h++) {
            System.out.println("\n" + h);
        }
    }

    public static void car() {
        System.out.println("\n");
        int z = 1;
        do {
            System.out.println("Sup");
            z++;
        } while (z < 4);
    }

}
