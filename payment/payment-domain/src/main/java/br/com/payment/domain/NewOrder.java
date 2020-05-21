package br.com.payment.domain;

import java.time.LocalDateTime;

public class NewOrder {

    private String id;
    private Double amount;
    private LocalDateTime date;
    private Costumer costumer;

    public NewOrder() {
    }

    public NewOrder(String id, Double amount, LocalDateTime date, Costumer costumer) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.costumer = costumer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    @Override
    public String toString() {
        return "NewOrder{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", costumer=" + costumer +
                '}';
    }
}
