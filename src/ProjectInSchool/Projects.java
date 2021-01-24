package ProjectInSchool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Projects {
    public static void main(String[] args) throws IOException {
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

        for (
                String value : s) {
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

        Panel jPanelButton = new Panel();
        jPanelTextField.setBounds(100, 400, 80, 20);

        JButton jButton = new JButton("Save");
        jButton.setBounds(100, 360, 80, 20);

        jPanelButton.add(jButton);
        jFrame.add(jPanelButton);
        jPanelTextField.setLayout(null);

        JTextField jTextField = new JTextField(50);
        jTextField.setBounds(100, i, 80, 20);
        jPanelTextField.add(jTextField);

//        jButton.addActionListener(e -> {
            String text = jTextField.getText();
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
//        });
    }
}
