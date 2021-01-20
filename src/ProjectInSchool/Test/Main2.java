package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.*;
//import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);

        String[] s = {"Имя:", "Фамилия:", "Класс:", "Группа:", "Компьютер:", "Дата:", "Номер урока:"};

        int p = 20;

        JPanel jPanelLabel = new JPanel();
        jPanelLabel.setBounds(0, 0, 100, 600);
        jFrame.add(jPanelLabel);
        jPanelLabel.setLayout(null);

        for (String value : s) {
            JLabel jLabel = new JLabel(value);
            jLabel.setBounds(6, p, 80, 20);
            jPanelLabel.add(jLabel);
            p += 40;
        }

        int i = 20;

        Panel jPanelTextField = new Panel();
        jPanelTextField.setBounds(100, 261, 100, 261);
        jFrame.add(jPanelTextField);
        jPanelTextField.setLayout(null);

        int[] g = {1, 2, 3, 4, 5, 6, 7};
        int j = 0;
        int i1 = 0;
        for ( ; j < g.length; j++) {
            i1 = i1 + g[j];
            JTextField jTextField = new JTextField(50);
            jTextField.setBounds(100, i, 80, 20);
            jPanelTextField.add(jTextField);
            i += 40;
        }

    }
}
