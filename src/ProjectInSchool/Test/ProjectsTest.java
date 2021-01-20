package ProjectInSchool.Test;

import javax.swing.*;
import java.awt.*;

public class ProjectsTest {
    public static void main(String[] args) {
        title();
    }

    static void title(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("Регистрация пользователя");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
    }
}
