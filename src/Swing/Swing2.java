package Swing;

import javax.swing.*;
import java.awt.*;
import java.io.*;


public class Swing2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.CYAN);
        jFrame.add(jPanel);

        JTextField jTextFieldName = new JTextField(50);
        jTextFieldName.setBounds(0, 200, 80, 20);
        jPanel.add(jTextFieldName);

        JTextField jTextFieldSurname = new JTextField(50);
        jTextFieldSurname.setBounds(0, 300, 80, 20);
        jPanel.add(jTextFieldSurname);

        JButton jButton = new JButton();
        jPanel.add(jButton, BorderLayout.SOUTH);

        jButton.addActionListener(e -> {
            String text = jTextFieldName.getText() + "\n" + jTextFieldSurname.getText();
            String path = "E:/Vlad/" + jTextFieldName.getText() + "/" + jTextFieldSurname.getText() + "/";

//            new File(path).mkdirs();

            File name = new File(path + jTextFieldName.getText() + ".txt");
            try (FileWriter fileWrite = new FileWriter(name)) {
                BufferedWriter bufferWriter = new BufferedWriter(fileWrite);
                bufferWriter.write(text);
                bufferWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });


        jFrame.setVisible(true);
        jFrame.setTitle("Hello");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 350, dimension.height / 2 - 350, 700, 700);
    }
}
