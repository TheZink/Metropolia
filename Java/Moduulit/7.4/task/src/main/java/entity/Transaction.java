package entity;

import jakarta.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "transactionDate")
    private String transactionDate;

    @Column(name = "FromCurrency")
    private String fromCurrency;
    
    @Column(name = "ToCurrency")
    private String toCurrency;

    @Column(name = "FromAmount")
    private double amount;

    @Column(name = "TotalAmount")
    private double totalAmount;

    public Transaction() {}

    public Transaction(String transactionDate, String fromCurrency, String toCurrency, double amount, double totalAmount) {
        this.transactionDate = transactionDate;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.totalAmount = totalAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
