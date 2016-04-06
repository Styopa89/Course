package lesson8.quadrat;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuadratRandomColor {

        public QuadratRandomColor() {
            JFrame f = new JFrame();
            f.setLocation(200,200);
            f.setMinimumSize(new Dimension(600,400));
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setContentPane(panel());
            f.pack();
            f.setVisible(true);
        }

        private JPanel panel(){
            JPanel panel = new JPanel();
            JButton button = new JButton();
            button.setBackground(new Color(0,0,0));
            button.setPreferredSize(new Dimension(200, 200));
            panel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random r = new Random();
                    int a =r.nextInt(255);
                    int b = r.nextInt(255);
                    int c = r.nextInt(255);
                    button.setBackground(new Color(a,b,c));
                }
            });
            return panel;
        }
    }
