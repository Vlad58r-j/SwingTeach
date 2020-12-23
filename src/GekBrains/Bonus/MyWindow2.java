package GekBrains.Bonus;

import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    static JTextArea textArea;

    public MyWindow2() throws HeadlessException {
        setSize(400, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Day");

        textArea = new JTextArea();
        add(textArea);
        for (int i = 0; i < 20; i++) {
            textArea.append("Just do it:\n");
        }
        add(new JButton("Let`s go"), BorderLayout.SOUTH);
        setVisible(true);
    }
}
