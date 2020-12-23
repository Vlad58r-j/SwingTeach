package GekBrains.lesson1;

public class Massiw11 {
    public static void main(String[] args) {
        double[] num = {10.2, 23.4, 23.34, 12.543, 23.1};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++) {
            result = result + num[i];
            System.out.println("Среднее значение равно " + result/5 + "\n");
        }
    }
}
