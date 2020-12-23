package GekBrains.lesson1;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        char cells[] = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;

        cells[position] = 'X'; //        for (char fre : cells) {
        System.out.print(cells);//            System.out.print(fre);
        System.out.println();//}

        do {
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели %s \n", s);
            int shoot = Integer.parseInt(s);

            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах");
                    cells[shoot] = '*';
                    System.out.println(cells);
                    break;
                case 'X':
                    System.out.println("Супер! Ты попал");
                    cells[shoot] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Ты уже сюда стрелял!");
                    System.out.println(cells);
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (cells[position] == 'X');
    }
}
