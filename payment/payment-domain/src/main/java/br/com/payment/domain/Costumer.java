package br.com.payment.domain;

public class Costumer {

    private Long id;
    private String name;
    private CreditCard creditCard;

    public Costumer() {
    }

    public Costumer(Long id, String name, CreditCard creditCard) {
        this.id = id;
        this.name = name;
        this.creditCard = creditCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
