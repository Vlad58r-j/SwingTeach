package GekBrains.HomeWork.lesson1;

import java.util.Scanner;

public class Ship {
   private int position;

    public Ship() {
        System.out.print("Положение корабля: ");
        Scanner scanner = new Scanner(System.in);
        position = scanner.nextInt();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}