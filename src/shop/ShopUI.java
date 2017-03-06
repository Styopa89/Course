package shop;

import shop.db.Shop;
import shop.db.Transactions;
import shop.product.Product;
import shop.transaction.Transaction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

public class ShopUI {
    private Shop shop;
    private Transactions transactions;

    public ShopUI(Shop shop) {
        this.shop = shop;
        transactions = new Transactions();
        JFrame f = new JFrame("Computer shop");
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

        JLabel product = new JLabel("Category: ");
        Vector products = new Vector<Product>();
        products.addAll(shop.getProducts());
        JComboBox combo = new JComboBox(products);


        JLabel countName = new JLabel("Count: ");

        NumberFormat count = NumberFormat.getNumberInstance();
        JFormattedTextField tfCount = new JFormattedTextField(count);
        tfCount.setValue(0);
        tfCount.setPreferredSize(new Dimension(45, 27));

        JButton buy = new JButton("BUY");
        JButton trans = new JButton("TRANSACTION");

        panel.add(lName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));
        panel.add(tfName, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));

        panel.add(product, new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));
        panel.add(combo, new GridBagConstraints(3, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));

        panel.add(countName, new GridBagConstraints(4, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));
        panel.add(tfCount, new GridBagConstraints(5, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));

        panel.add(buy, new GridBagConstraints(5, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));
        panel.add(trans, new GridBagConstraints(4, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(5, 0, 0, 0), 0, 0));

        buy.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                int count = Integer.parseInt(tfCount.getText());
                Product brand = (Product)combo.getSelectedItem();

                Date data = new Date();
                transactions.addTransaction(new Transaction(data, name, brand,count));
                System.out.println(data + "  " +name + " " + brand.getCategory() + " " + count);
            }
        });

        trans.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<String> nameCollum = new Vector();
                nameCollum.addElement("ID");
                nameCollum.addElement("Date");
                nameCollum.addElement("Client");
                nameCollum.addElement("Product");
                nameCollum.addElement("Count");
                Vector<Transaction> tran = new Vector<Transaction>();
                tran.addAll(transactions.getTransaction());


//                JTable table = new JTable(tran, nameCollum);
//                JScrollPane sp = new JScrollPane(table);
//                panel.add(sp);
//                String name = tfName.getText();
//                int count = Integer.parseInt(tfCount.getText());
//                Product brand = (Product)combo.getSelectedItem();
//
//                Date data = new Date();
//                transactions.addTransaction(new Transaction(data, name, brand,count));
                transactions.printTransaction();


            }
        });
        return panel;
    }

}
