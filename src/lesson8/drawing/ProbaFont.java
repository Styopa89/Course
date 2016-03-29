package lesson8.drawing;


import javax.swing.*;
import java.awt.*;

public class ProbaFont extends JPanel {

    public ProbaFont(){
        JFrame frame = new JFrame("My second window");

        frame.setLocation(300,200);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        JLabel label = new JLabel("HI World !!");
        Font font = new Font("Calibri", Font.BOLD, 52);
        frame.getContentPane().add(label).setFont(font);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ProbaFont probaFont = new ProbaFont();
    }

}
