package GekBrains.lesson2;

import java.util.Objects;

public class Cat01 {
    String name;
    static int catsAmount;

    public Cat01(String name) {
        this.name = name;
        catsAmount++;
    }

    void about() {
        System.out.println(name);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat01 cat01 = (Cat01) o;
        return Objects.equals(name, cat01.name);
    }
}
