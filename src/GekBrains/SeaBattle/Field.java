package GekBrains.SeaBattle;

public class Field {
    public static final int INT = 10;
    char[] cells = new char[INT];
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

   void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Супер! Ты попал");
                cells[shoot] = '-';
                break;
            case '*':
                System.out.println("Ты уже сюда стрелял!");
                break;
            default:
                System.out.println("ERROR");
        }
    }

    void show() {
        System.out.println(cells);
    }

    boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }
}
