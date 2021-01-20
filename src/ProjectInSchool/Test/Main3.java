package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame();

        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 600);

        String[] s = {"Имя:", "Фамилия:", "Класс:", "Компьютер:", "Дата:", "Номер урока:"};

        int p = 20;

        JPanel jPanelLabel = new JPanel();
        jPanelLabel.setBounds(0, 0, 100, 600);
        jFrame.add(jPanelLabel);
        jPanelLabel.setLayout(null);

        for (
                String value : s) {
            JLabel jLabels = new JLabel(value);
            jLabels.setBounds(6, p, 80, 20);
            jPanelLabel.add(jLabels);
            p += 40;
        }

        String[] d = {"По образцу: Иван", "По образцу: Краснов", "По образцу: 8А",
                "По образцу: 12", "По образцу: 17.08.2014", "По образцу: 2"};

        int t = 20;

        JPanel jPaneled = new JPanel();
        jPaneled.setBounds(280, 20, 200, 261);
        jFrame.add(jPaneled);
        jPaneled.setLayout(null);

        for (String s1 : d) {
            JLabel jLabeled = new JLabel(s1);
            jLabeled.setBounds(300, t, 200, 20);
            jPaneled.add(jLabeled);
            t += 40;
        }
//        Panel jPanelButton = new Panel();
//        jPanelButton.setBounds(0, 400, 0, 0);
//        jFrame.add(jPanelButton);
//        jPanelButton.setLayout(null);

//        JButton jButton = new JButton("Save");
//        jPanelButton.add(jButton, BorderLayout.SOUTH);

        int i = 20;

        Panel jPanelTextField = new Panel();
        jPanelTextField.setBounds(100, 261, 150, 261);
        jFrame.add(jPanelTextField);
        jPanelTextField.setLayout(null);

        while (i <= 220) {
            JTextField jTextField = new JTextField(140);
            jTextField.setBounds(100, i, 140, 20);
            jPanelTextField.add(jTextField);
            i += 40;

//            jButton.addActionListener(e -> {
                jPanelTextField.add(jTextField);
                String text = jTextField.getText() + "\n";
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
//            });

        }

    }
}
