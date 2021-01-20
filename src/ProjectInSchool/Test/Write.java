package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Write{
    static JButton button;
    static JTextField one;
    static JTextField two;
    public static void main(String[] args){
        JFrame frame = new JFrame("test");
        one = new JTextField(20);
        two = new JTextField(20);
        button = new JButton("write file");
        button.addActionListener(new ButtonListener());
        JPanel mainPanel = new JPanel();
        mainPanel.add(one);
        mainPanel.add(two);
        mainPanel.add(button);
        frame.getContentPane().add(mainPanel);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
    public static class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                File file = new File("test.txt");
                FileWriter fw = new FileWriter(file.getAbsolutePath());
                BufferedWriter bw = new BufferedWriter(fw);
                String content = one.getText() + " " + two.getText();
                bw.write(content);
                bw.close();
                System.out.println("Done");
            } catch (Exception ex){ex.printStackTrace();}
        }
    }
}
