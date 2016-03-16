package lesson8.createwindow;


import javax.swing.*;
import java.awt.*;

public class CreateWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(300,100, 800, 600);
        f.setBackground(new Color(180,180,180));
        f.setVisible(true);
    }
}
