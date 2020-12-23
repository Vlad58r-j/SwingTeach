package GekBrains.lesson2;

public class Stackoverflow {
    private static int i;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("testing....." + i++);
        test();
    }
}
