package ProjectInSchool.Test;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {
    static JButton button;
    static JTextField one;
    static JTextField two;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("test");
        one = new JTextField(20);
        two = new JTextField(20);
        button = new JButton("write file");
        JPanel mainPanel = new JPanel();
        mainPanel.add(one);
        mainPanel.add(two);
        mainPanel.add(button);
        frame.setSize(300, 400);
        frame.setVisible(true);
        String c = one.getText();
        String c1 = two.getText();
        System.out.println(c);
        System.out.println(c1);
        File newFile = new File("E:/Vlad/vot.txt");
        try {
            boolean created = newFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
//        }
//        File file1 = new File("E://Vlad", "Name.txt");
//        File file2 = new File(file, "Name.txt");
//        System.out.println("Done");
//        File file = new File("E://Vlad");

        String text = "Hello world!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("E://Vlad")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
