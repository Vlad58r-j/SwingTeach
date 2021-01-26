package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        jFrame.add(jPanel);
        jPanel.setLayout(null);

        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 600);

        JPanel jPanelTextField = new JPanel();
        jPanelTextField.setBounds(150,0,140,320);
        jFrame.add(jPanelTextField);
        jPanelTextField.setLayout(null);

        int i = 20;

        for (; i <= 320; i+=40) {
            JTextField jTextField = new JTextField(140);
            jTextField.setBounds(149, i, 140, 20);
            jPanelTextField.add(jTextField);
        }
//
//        JPanel jPanelLabelLeft = new JPanel();
//        jPanelLabelLeft.setBounds(0,0,120,320);
//        jPanel.add(jPanelLabelLeft);
//        jPanelLabelLeft.setLayout(null);

        String[] s = {"Имя:", "Фамилия:", "Класс:", "Компьютер:", "Дата:", "Номер урока:", "Примечание к пк: "};

        int p = 20;

        for (
                String value : s) {
            JLabel jLabels = new JLabel(value);
            jLabels.setBounds(6, p, 120, 20);
            jPanel.add(jLabels);
            p += 40;
        }

//        JPanel jPanelLabelRight = new JPanel();
//        jPanelLabelRight.setBounds(299,0,200,320);
//        jPanel.add(jPanelLabelRight);
//        jPanelLabelRight.setLayout(null);

        String[] d = {"По образцу: Иван", "По образцу: Краснов", "По образцу: 8А",
                "По образцу: 12", "По образцу: 17.08.2014", "По образцу: 2"};

        int t = 20;

        for (String s1 : d) {
            JLabel jLabeled = new JLabel(s1);
            jLabeled.setBounds(300, t, 200, 20);
            jPanel.add(jLabeled);
            t += 40;
        }

//        Panel jPanelButton = new Panel();
//        jPanelButton.setBounds(0, 400, 0, 0);
//        jFrame.add(jPanelButton);
//        jPanelButton.setLayout(null);

//        JButton jButton = new JButton("Save");
//        jPanelButton.add(jButton, BorderLayout.SOUTH);

//        JPanel jPanelTextField = new JPanel();
//        jPanelTextField.setBounds(100,0,140,260);
//        jFrame.add(jPanelTextField);
//        jPanelTextField.setLayout(null);
//         jButton.addActionListener(e -> {
//                jPanelTextField.add(jTextField);
//                String text = jTextField.getText() + "\n";
//                String file = "E:/Vlad/vot.txt";
//                FileWriter fileWrite = null;
//                try {
//                    fileWrite = new FileWriter(file);
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//
//                assert fileWrite != null;
//                BufferedWriter bufferWriter = new BufferedWriter(fileWrite);
//
//                try {
//                    bufferWriter.write(text);
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//
//                try {
//                    bufferWriter.close();
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
//            });
    }
}
