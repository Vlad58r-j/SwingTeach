package GekBrains.HomeWork.lesson1;

import java.util.Scanner;

public class Player {
    int play() {
        System.out.print("Куда стрелять: ");
        Scanner scanner = new Scanner(System.in);
        String shoot = scanner.nextLine();
        int i = Integer.parseInt(shoot);
//        if (i <= 0 || i >= 11) {
//            System.out.println("Выстрел за границу: " + i);
//            play();
//        }
        return i;
    }
}