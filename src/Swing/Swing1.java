package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Swing1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.CYAN);
        jFrame.add(jPanel);
        JTextField jTextField = new JTextField(50);
        jTextField.setBounds(0, 200, 80, 20);
        jPanel.add(jTextField);
        JTextField jTextField1 = new JTextField(50);
        jTextField1.setBounds(0, 300, 80, 20);
        jPanel.add(jTextField1);
        JButton jButton = new JButton();
        jPanel.add(jButton, BorderLayout.SOUTH);
        jButton.addActionListener(e -> {
//            String text = jTextField.getText() + "\n" + jTextField1.getText() + "\n";
            String text = jTextField.getText() + "\n" + jTextField1.getText() + "\n";
            String file = "E:/Vlad/vot.txt";
            FileWriter fileWrite = null;
            try {
                fileWrite = new FileWriter(file);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            assert fileWrite != null;
            BufferedWriter bufferWriter = new BufferedWriter(fileWrite);

            try {
                bufferWriter.write(text);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            try {
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
