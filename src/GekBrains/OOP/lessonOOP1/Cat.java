package GekBrains.OOP.lessonOOP1;

public class Cat {//характеристики(состояние) и методы(поведение)
    //характеристики(состояние)
    int age;
    String name;
    double weight;
    boolean isMale;
    Tail tail;
    Talisman talisman;

    //        методы(поведение)
    void voice() {
        System.out.println("Myau");
    }

    void sleep() {
        System.out.println("Hrrrrr");
    }

    void about() {
        String s = "Cat {" +
                "Age = " + age +
                ", Name = " + name +
                ", Weight = " + weight +
                ", IsMale = " + isMale +
                ", Tail = " + tail +
                ", Talisman = " + talisman +
                "}";
        System.out.println(s);
    }
//    Cat() {
//        System.out.println("Выведи пустой конструктор");
//    }
    //alt+insert

        public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}
