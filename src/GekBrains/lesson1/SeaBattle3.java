package GekBrains.lesson1;

import java.util.Scanner;

public class SeaBattle3 {
    public static void main(String[] args) {
        char[][] cells = new char[10][10];

        for (int x = 0; x < 10; x++) { // надо сделать перевод сторки чтобы рисовалось поле, а не звездочки в строку. Найди где поставить.
            for (int j = 0; j < 10; j++) {
                cells[x][j] = '*';
                System.out.print(" " + cells[x][j]);
            }
        }
        System.out.println();
        Scanner a1 = new Scanner(System.in);
        int b1;
        b1 = a1.nextInt();
        int position1 = b1;

//        cells[position1] = 'x';
        System.out.println(cells);
        System.out.println();

//        do {
//            Scanner a2 = new Scanner(System.in);
//            int b2;
//            b2 = a2.nextInt();

////            switch (cells[b2]) {
//                case '*':
//                    System.out.println("ХАХАХАХХАХ промах!");
////                    cells[b2] = '.';
//                    System.out.println(cells);
//                    break;
//                case 'x':
//                    System.out.println("Точно в цель!");
////                    cells[b2] = '-';
//                    System.out.println(cells);
//                    break;
//                case '.':
//                    System.out.println("Забыл? Ты сюда уже стрелял!");
//                    System.out.println(cells);
//                    break;
//                default:
//            }
////        } while (cells[position1] == 'x');
    }
}
