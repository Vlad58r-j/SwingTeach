package GekBrains.HomeWork.lesson1;

import java.util.Scanner;

public class Field {
    Scanner scanner = new Scanner(System.in);
    int y = scanner.nextInt();
    char[] cells = new char[y];
    Ship ship;

    void pole() {
        for (int x = 1; x < cells.length; x++) {
            cells[x] = '*';
        }
    }

    void positionShip(Ship ship) {
        this.ship = ship;
        cells[ship.getPosition()] = 'X';
    }

    void occupied(int shoot) {
        switch (cells[shoot]) {
            case '*':
                System.out.println("ХАХАХАХХАХ промах!");
                cells[shoot] = '!';
                System.out.println(cells);
                break;
            case 'X':
                System.out.println("Точно в цель!");
                cells[shoot] = '-';
                System.out.println(cells);
                break;
            case '!':
                System.out.println("Забыл? Ты сюда уже стрелял!");
                System.out.println(cells);
                break;
            default:
        }
    }

    void show() {
        System.out.println(cells);
    }

    boolean isGameOver() {
        return cells[ship.getPosition()] == 'X';
    }
}
