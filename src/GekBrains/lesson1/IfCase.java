package GekBrains.lesson1;

public class IfCase {
    public static void main(String[] args) {
        int a = 100;
        int b = 12434;
        boolean x = true;
        boolean y = false;

        if (a > b) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        int grade = 34;
        switch (grade) {
            case 2:
                System.out.println("Norm");
                break;
            case 4:
                System.out.println("Okey");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
