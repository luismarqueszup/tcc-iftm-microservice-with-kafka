package br.com.neworder.domain;

import java.time.LocalDate;

public class CreditCard {

    private String creditCardNumber;
    private LocalDate validationDate;
    private Double creditLimit;

    public CreditCard() {
    }

    public CreditCard(String creditCardNumber, LocalDate validationDate, Double creditLimit) {
        this.creditCardNumber = creditCardNumber;
        this.validationDate = validationDate;
        this.creditLimit = creditLimit;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public LocalDate getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(LocalDate validationDate) {
        this.validationDate = validationDate;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
