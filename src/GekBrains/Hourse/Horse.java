package GekBrains.Hourse;

public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    void eat() {
        about();
        System.out.println("eating. . .");
    }

    void about() {
        String pol = (isMale) ? "Male" : "Female";//тернарный оператор
        System.out.printf("Name: %s; age: %d; pol: %s\t\t", name, age, pol);
    }

    void ride() {
        about();
        System.out.println("Riding at speed: " + speed);
    }

    void vid() {
        about();
        System.out.println("My color: " + color);
    }
}
