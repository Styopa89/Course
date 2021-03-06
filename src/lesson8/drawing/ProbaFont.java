package lesson8.drawing;


import javax.swing.*;
import java.awt.*;

public class ProbaFont extends JPanel {
    private int x;

    public ProbaFont() {
        x = 0;
        JFrame frame = new JFrame("My second window");

        frame.setLocation(300, 200);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.gray);
        g.fillRect(0, 0, 600, 400);

        g.setColor(Color.BLUE);
        g.fillRect(x, 50, 20, 20);

        g.setColor(Color.GREEN);
        g.fillRect(x, 100, 20, 20);

        g.setColor(Color.RED);
        g.setFont(new Font("Calibri", Font.BOLD, 52));
        g.drawString("Hello World!", 200, 200);
    }

    public static void main(String[] args) throws InterruptedException {
        ProbaFont probaFont = new ProbaFont();
        Thread.sleep(1000);

        probaFont.x = 50;
        Thread.sleep(1000);

        probaFont.repaint();


    }
}
