package bank;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Transaction implements Serializable {
    private String id; // Unique id for transaction
    private Date date;
    private int amount; // Positive for deposit, Negative for withdraw
    private int balance; // Balance AFTER transaction is completed

    public Transaction(int amount, int balance) {
        this.id = UUID.randomUUID().toString();
        this.date = new Date();
        this.amount = amount;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date) + "\t| €" + amount + "\t\t\t| €" + balance;
    }
}
