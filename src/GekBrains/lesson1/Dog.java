package GekBrains.lesson1;

public class Dog {
    public static void main(String[] args) {
        String s;
        s = aport("Bone", 12);
        System.out.println(s);
        System.out.println("\nTranslate:");
        System.out.println("\nПожеванная косточка, количество 12");
    }

    static String aport(String it, int amount) {
        String result;
        result = "Chewed " + it + ", quantity " + amount;
        return result;//Поместить в стэк
    }
}

//Stack

// | 4 |
// | 3 |
// | 2 |
// | 1 |
// ____
