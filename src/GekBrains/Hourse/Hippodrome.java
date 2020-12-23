package GekBrains.Hourse;

import java.util.Random;

public class Hippodrome {

    public static void main(String[] args) {
        Horse[] hours = new Horse[10];

        Random random = new Random();

        for (int i = 0; i < hours.length; i++) {
            hours[i] = new Horse();
            hours[i].name = "Буцефал " + i;
            hours[i].age = 1 + random.nextInt(10);
            hours[i].speed = 5 + random.nextInt(66);
            hours[i].isMale = random.nextBoolean();
        }

        for (Horse horse : hours) {
            horse.ride();
        }
    }
}
