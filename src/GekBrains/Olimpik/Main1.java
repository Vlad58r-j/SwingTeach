package GekBrains.Olimpik;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.print("Введи число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Вы ввели число: %d\n", n);

        int[] m = new int[n];

            for (int i = 1; i <= m.length; i++) {
                System.out.printf("%d число - ", i);
                Scanner scanner2 = new Scanner(System.in);
                int a1 = scanner2.nextInt();
                m[i] = a1;
                m[i]++;
                int v = 0;
                int zac = 0;
                while (m[i] < n) {
                    zac = m[i] + n - v;
                    System.out.println(zac);
                    v++;
                    m[i]++;
                }
            }
    }
}