package GekBrains.SeaBattle;

import java.util.Scanner;

public class Player {
    int getShoot() {
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.printf("Вы ввели %s \n", s);
        return Integer.parseInt(s);
    }
}
