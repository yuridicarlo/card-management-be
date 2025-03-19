package com.cg.bnl.cardfsm.domain.service;

import com.cg.bnl.cardfsm.domain.model.Card;
import com.cg.bnl.cardfsm.port.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void createCard(String cardNumber, String cardType) {
        cardRepository.createCard(cardNumber, cardType);
    }

    public void deactivateCard(int cardId) {
        cardRepository.deactivateCard(cardId);
    }

    public void deleteCard(int cardId) {
        cardRepository.deleteCard(cardId);
    }

    public List<Card> listCards() {
        return cardRepository.listCards();
    }
}