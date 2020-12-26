package ProjectInSchool;

import javax.swing.*;
import java.awt.*;

public class Projects {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(null);

        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);

        JLabel label = new JLabel("Имя: ");
        JTextField jTextField = new JTextField(15);
        label.setBounds(10, 20, 80, 20);
        jPanel.add(label);
        jTextField.setBounds(100, 20,80,20);
        jPanel.add(jTextField);

        JLabel label1 = new JLabel("Фамилия: ");
        JTextField jTextField1 = new JTextField(15);
        label1.setBounds(10, 60, 80, 20);
        jPanel.add(label1);
        jTextField1.setBounds(100, 60,80,20);
        jPanel.add(jTextField1);

        JLabel label2 = new JLabel("Класс: ");
        JTextField jTextField2 = new JTextField(15);
        label2.setBounds(10, 100, 80, 20);
        jPanel.add(label2);
        jTextField2.setBounds(100, 100,80,20);
        jPanel.add(jTextField2);

        JLabel label3 = new JLabel("Компьютер: ");
        JTextField jTextField3 = new JTextField(15);
        label3.setBounds(10, 140, 80, 20);
        jPanel.add(label3);
        jTextField3.setBounds(100, 140,80,20);
        jPanel.add(jTextField3);

        JLabel label4 = new JLabel("Дата: ");
        JTextField jTextField4 = new JTextField(15);
        label4.setBounds(10, 180, 80, 20);
        jPanel.add(label4);
        jTextField4.setBounds(100, 180,80,20);
        jPanel.add(jTextField4);

        JLabel label5 = new JLabel("Номер урока: ");
        JTextField jTextField5 = new JTextField(15);
        label5.setBounds(10, 220, 80, 20);
        jPanel.add(label5);
        jTextField5.setBounds(100, 220,80,20);
        jPanel.add(jTextField5);

    }
}
