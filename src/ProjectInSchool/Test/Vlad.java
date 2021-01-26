package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Vlad {
    static JTextField name;
    static JTextField surname;
    static JTextField klass;
    static JTextField data;
    static JTextField numberLesson;
    static JTextField PK;
    static JTextField numberPK;
    static JButton button;
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jFrame.add(jPanel);
//        jPanel.setBounds(0,0,300,300);

        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 600);

        button = new JButton("Сохранить");

        name = new JTextField(140);
        name.setBounds(150,20,140,20);

        surname = new JTextField(140);
        surname.setBounds(150,60,140,20);

        data = new JTextField(140);
        data.setBounds(150,100,140,20);

        numberLesson = new JTextField(140);
        numberLesson.setBounds(150,140,140,20);

        klass = new JTextField(140);
        klass.setBounds(150,180,140,20);

        numberPK = new JTextField(140);
        numberPK.setBounds(150,220,140,20);

        PK = new JTextField(140);
        PK.setBounds(150,260,140,20);

        jPanel.add(name);
        jPanel.add(surname);
        jPanel.add(data);
        jPanel.add(numberLesson);
        jPanel.add(klass);
        jPanel.add(numberPK);
        jPanel.add(PK);

        String[] s = {"Имя:", "Фамилия:", "Дата:", "Номер урока:", "Класс:", "Номер ПК: ","Примечание к пк: "};

        int i = 20;
//        JPanel jPanelLabel1 = new JPanel();
//        jPanelLabel1.setBounds(0, 0, 120, 320);
//        jFrame.add(jPanelLabel1);
//        jPanelLabel1.setLayout(null);
        for (String value : s) {
            JLabel jLabels = new JLabel(value);
            jLabels.setBounds(6, i, 120, 20);
            jPanel.add(jLabels);
            i += 40;
        }
//        for (; t <= 320; t += 40) {
//            JTextField jTextField = new JTextField(140);
//            jTextField.setBounds(150, t, 140, 20);
//            jPanel.add(jTextField);
//        }
//        JPanel jPanelLabel2 = new JPanel();
//        jPanelLabel2.setBounds(300, 0, 200, 320);
//        jFrame.add(jPanelLabel2);
//        jPanelLabel2.setLayout(null);

        String[] d = {"По образцу: Иван", "По образцу: Краснов", "По образцу: 17.08.2014",
                "По образцу: 2", "По образцу: 8А", "По образцу: 12", };

        int f = 20;

        for (String s1 : d) {
            JLabel jLabeled = new JLabel(s1);
            jLabeled.setBounds(300, f, 200, 20);
            jPanel.add(jLabeled);
            f += 40;
        }
//
//        JPanel jPanelLabelLeft = new JPanel();
//        jPanelLabelLeft.setBounds(0,0,120,320);
//        jPanel.add(jPanelLabelLeft);

//        JPanel jPanelLabelRight = new JPanel();
//        jPanelLabelRight.setBounds(299,0,200,320);
//        jPanel.add(jPanelLabelRight);
//        jPanelLabelRight.setLayout(null);
//        jPanelLabelLeft.setLayout(null);
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
