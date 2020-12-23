package GekBrains.Bonus;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Day");
        JButton n = new JButton("Java SOUTH");
        add(n, BorderLayout.SOUTH);
        add(new JButton("Java CENTER"), BorderLayout.CENTER);
        add(new JButton("Java NORTH"), BorderLayout.NORTH);
        add(new JButton("Java EAST"), BorderLayout.EAST);
        add(new JButton("Java WEST"), BorderLayout.WEST);

        setVisible(true);
    }
}
