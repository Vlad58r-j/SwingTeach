package GekBrains.lesson2;

public class equals {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");

        if (string1 == string3) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (string2.equals(string3)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (string1 == string2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
