package lesson8.drawing;




import javax.swing.*;
import java.awt.*;



public class HowToDraw extends JPanel {
    private int x;

    public HowToDraw(){
        x = 0;
        JFrame frame = new JFrame("My window");

        frame.setLocation(300,200);
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
        g.fillRect(0,0,600,400);

        g.setColor(Color.BLUE);
        g.fillRect(x, 50, 20, 20);

        g.setColor(Color.GREEN);
        g.fillRect(x, 100, 20, 20);
    }

    public static void main(String[] args) throws InterruptedException {
        HowToDraw htd = new HowToDraw();
        Thread.sleep(1000);

//        htd.repaint();
        htd.x = 50;
        Thread.sleep(1000);

        htd.repaint();





    }
}
