package GekBrains.lesson1;

import java.util.Scanner;

public class SeaBattle2 {
    public static void main(String[] args) {
        char[] cells = new char[10];

        for (int x = 0; x < 10; x++) {
            cells[x] = '*';
            System.out.print(" " + cells[x]);
        }
        System.out.println();
        Scanner a1 = new Scanner(System.in);
        int b1;
        b1 = a1.nextInt();
        int position1 = b1;

        cells[position1] = 'x';
        System.out.println(cells);
        System.out.println();

        do {
            Scanner a2 = new Scanner(System.in);
            int b2;
            b2 = a2.nextInt();

            switch (cells[b2]) {
                case '*':
                    System.out.println("ХАХАХАХХАХ промах!");
                    cells[b2] = '.';
                    System.out.println(cells);
                    break;
                case 'x':
                    System.out.println("Точно в цель!");
                    cells[b2] = '-';
                    System.out.println(cells);
                    break;
                case '.':
                    System.out.println("Забыл? Ты сюда уже стрелял!");
                    System.out.println(cells);
                    break;
                default:
            }
        } while (cells[position1] == 'x');
    }
}
