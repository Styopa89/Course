package shop.transaction;


import shop.product.Product;

import java.util.Date;

public class Transaction {
//    private static int count;
    private Date date;
    private String client;
    private Product product;
    private int countProduct;

    public Transaction(Date date, String client, Product product, int ountProduct) {
//        ++count;
        this.date = date;
        this.client = client;
        this.product = product;
        this.countProduct = ountProduct;
    }

//    public Transaction(){
//        ++count;
//    }

    public Date getDate() {
        return date;
    }

    public String getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getCountProduct() {
        return countProduct;
    }



//    public static int getCount() {
//        return count;
//    }
}
