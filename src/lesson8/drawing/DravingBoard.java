package lesson8.drawing;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class DravingBoard extends JPanel{
    private final static String IMAGE_NAME = "image.jpg";
    private Image image;

    public DravingBoard() {
        JFrame frame = new JFrame("My second window");
        frame.setLocation(300, 200);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        try {
            image = ImageIO.read(new File(IMAGE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.gray);
        g.fillRect(0, 0, 600, 400);


        g.setColor(Color.RED);
        g.setFont(new Font("Calibri", Font.BOLD, 52));
        g.drawString("Hello World!", 200, 200);

        g.drawImage(image, 0, 0, new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        DravingBoard probaFont = new DravingBoard();
        probaFont.repaint();


    }
}
