package lesson8.guishop;

import javax.swing.*;
import java.awt.*;

public class ShopUI {
    private Shop shop;

    public ShopUI(Shop shop) {
        this.shop = shop;
        JFrame f = new JFrame("Car shop");
        f.setMinimumSize(new Dimension(600, 200));
        f.setLocation(500, 200);

        f.getContentPane().add(createSellingPannel());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

    }

    private JPanel createSellingPannel() {
        JPanel panel = new JPanel();

        JLabel lName = new JLabel("Name client:");
        JTextField tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(100, 27));
        panel.setLayout(new FlowLayout());
        JLabel product = new JLabel("Product");
        String[] productCar = {"BMV", "AUDI", "WV", "MERCEDES"};
        JComboBox combo = new JComboBox(productCar);
//        combo.setSelectedIndex(0);

        JLabel count = new JLabel(" Count:");
        JTextField tfCount = new JTextField();
        tfCount.setPreferredSize(new Dimension(30, 27));

        JButton buy = new JButton("BUY");

        panel.add(lName);
        panel.add(tfName);

        panel.add(combo);

        panel.add(count);
        panel.add(tfCount);

        panel.add(buy);

        return panel;
    }

}
