package GekBrains.OOP.lessonOOP2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Gav();
        cat.home = "HOME";
        cat.sing = "MAYU";
        cat.home = "Tom";
        cat.food = "Food";
//        cat.about();

        Dog dog = new Dog();
        dog.age = 3;
        dog.home = "HOME";
        dog.sing = "GAW";
        dog.name = "Bob";
        dog.food = "Food";
//        dog.about();

        Crocodile crocodile = new Crocodile();
        crocodile.Gav();
        crocodile.Gav(4, "rtryr");
        crocodile.sing = "GGGGGRRRRR";
        crocodile.food = "Animal";
        crocodile.home = "HOME";
//        cat.about();

        Lion lion= new Lion();
        lion.tooth = "2";
        lion.food = "Alex";
//        lion.about();

        Animal[] animals = new Animal[4];

        animals[1] = dog;



        AnimalWild[] animalWilds = new AnimalWild[4];
        animalWilds[0] = cat;
        animalWilds[2] = crocodile;
        animalWilds[3] = lion;
        for (Animal animal : animals) {
            animal.about();
        }
    }
}
