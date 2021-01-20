package Swing;

import javax.swing.*;
import java.awt.*;

public class Main1 {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JLabel("Фамилия"));
        jPanel.add(new JTextField(20));
        jPanel.add(new JPasswordField(20));
        JTextField jTextField1 = new JTextField();
        JTextArea jTextArea = new JTextArea(2,15);
        jTextArea.setLineWrap(true);
        jTextField1.getText();
        jTextField1.setBackground(Color.black);
        jPanel.revalidate();
        jPanel.add(jTextArea);

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("Hello");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 350, dimension.height / 2 - 350, 700, 700);
        return jFrame;
    }
}
