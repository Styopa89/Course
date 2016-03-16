package lesson8.createwindow;


import javax.swing.*;
import java.awt.*;

public class CreateWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setMinimumSize(new Dimension(800, 600));
        f.setLocation(300, 100);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
