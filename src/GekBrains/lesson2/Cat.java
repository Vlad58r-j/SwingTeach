package GekBrains.lesson2;

public class Cat {
    String name;
    static int catsAmount;

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    void about() {
        System.out.println(name);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }
}
