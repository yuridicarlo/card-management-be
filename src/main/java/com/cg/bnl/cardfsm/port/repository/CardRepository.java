package com.cg.bnl.cardfsm.port.repository;

import com.cg.bnl.cardfsm.domain.model.Card;

import java.util.List;

public interface CardRepository {
    void createCard(String cardNumber, String cardType);
    void deactivateCard(int cardId);
    void deleteCard(int cardId);
    List<Card> listCards();
}