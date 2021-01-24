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

        JTextField jTextField = new JTextField(50);
        jTextField.setBounds(0, 200, 80, 20);
        jPanel.add(jTextField);

        JTextField jTextField1 = new JTextField(50);
        jTextField1.setBounds(0, 300, 80, 20);
        jPanel.add(jTextField1);

        JButton jButton = new JButton();
        jPanel.add(jButton, BorderLayout.SOUTH);

        jButton.addActionListener(e -> {
            String text = jTextField.getText()+ "\n" + jTextField1.getText();
            String mon = jTextField.getText()+".txt";
            File way = new File("E:/Vlad/" + jTextField.getText() + "/" + jTextField1.getText()+"/");
            boolean save = way.mkdirs();
            File file = new File(mon);
            String name = save + "/" + jTextField.getText() + ".txt";
//            FileWriter fileWriter = null;
//            try {
//                fileWriter = new FileWriter(name);
//                for (int i = 0; i < text.length(); i++) {
//                    fileWriter.write(text.charAt(i));
//                }
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            } finally {
//                try {
//                    fileWriter.close();
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//            }
            FileWriter fileWrite = null;
            try {
                fileWrite = new FileWriter(name);
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
