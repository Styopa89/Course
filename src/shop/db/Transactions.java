package shop.db;

import shop.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;


public class Transactions {
    private List<Transaction> transaction;

    public Transactions() {
        transaction = new ArrayList();
    }

    public void addTransaction(Transaction t) {
        transaction.add(t);

    }

    public List getTransaction() {
        return transaction;
    }

    public void printTransaction(){
        for (Transaction t: transaction) {
            System.out.println(t.getDate() + ", " + t.getClient() + ", " + t.getProduct().getCategory() + ", " + t.getCountProduct());
        }
    }
}
