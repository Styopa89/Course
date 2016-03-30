package lesson8.guishop;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

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
        panel.setLayout(new GridBagLayout());
        JLabel lName = new JLabel("Name client: ");
        JTextField tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(100, 27));

        JLabel product = new JLabel("Brand: ");
        String[] productCar = {"BMV", "AUDI", "WV", "MERCEDES"};
        JComboBox combo = new JComboBox(productCar);
//        combo.setSelectedIndex(0);

        JLabel countName = new JLabel("Count: ");
        NumberFormat count = NumberFormat.getNumberInstance();
        JFormattedTextField tfCount = new JFormattedTextField(count);
        tfCount.setValue(0);
        tfCount.setPreferredSize(new Dimension(45, 27));

        JButton buy = new JButton("BUY");

        panel.add(lName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
        panel.add(tfName, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

        panel.add(product, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
        panel.add(combo, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

        panel.add(countName, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
        panel.add(tfCount, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

        panel.add(buy, new GridBagConstraints(1, 4, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

        return panel;
    }

}
