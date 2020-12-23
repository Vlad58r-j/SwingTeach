package GekBrains.HomeWork.lesson1;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.println("Game start!");
        System.out.print("Введите размер поля: ");
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();


        field.pole();
        field.positionShip(ship);
        field.show();

        do {
            field.occupied(player.play());
        } while (field.isGameOver());
    }
}
