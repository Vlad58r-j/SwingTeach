package GekBrains.SeaBattle;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship(4);

        field.init();
        field.setShip(ship);

        System.out.println("Game start!");

        do {
            field.show();
            field.doShoot(player.getShoot());
        } while (field.isNotGameOver());
    }
}
