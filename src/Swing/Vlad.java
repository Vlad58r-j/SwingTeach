package Swing;

import java.io.File;
import java.io.IOException;

public class Vlad {

    public static void main(String[] args) {
        File s = new File("ton/");
        File f = new File("E:/Vlad/" + s + "/vot.txt");
        try {
            boolean created = f.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//        if () {
//            System.out.println("Directory is created");
//        } else {
//            System.out.println("Directory cannot be created");
//        }
    }
}