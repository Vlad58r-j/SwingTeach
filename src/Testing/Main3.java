package Testing;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File folder = new File("E:/Vlad/main3/dad/mom/vot.txt");
        System.out.println("folder.mkdir(): " + folder.mkdirs());
    }
}