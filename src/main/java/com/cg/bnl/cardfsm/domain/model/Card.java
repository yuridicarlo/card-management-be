package com.cg.bnl.cardfsm.domain.model;

public class Card {
    
    private int id;
    private String cardNumber;
    private String cardType;
    private String status;

    public Card(int id, String cardNumber, String cardType, String status) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}