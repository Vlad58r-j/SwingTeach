package GekBrains.TV;

public class Sofa {
    public static void main(String[] args) {
        TV pult1 = new TV();
        pult1.currentChanel = 4;

        pult1.whatsiscurrentChanel();

        TV pult2;

        pult2 = pult1;
        pult2.currentChanel = 400;

        pult1.whatsiscurrentChanel();
    }
}
