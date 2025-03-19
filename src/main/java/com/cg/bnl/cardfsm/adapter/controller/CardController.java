package com.cg.bnl.cardfsm.adapter.controller;

import com.cg.bnl.cardfsm.domain.model.Card;
import com.cg.bnl.cardfsm.domain.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public void createCard(@RequestParam String cardNumber, @RequestParam String cardType) {
        cardService.createCard(cardNumber, cardType);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateCard(@PathVariable int id) {
        cardService.deactivateCard(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable int id) {
        cardService.deleteCard(id);
    }

    @GetMapping
    public List<Card> listCards() {
        return cardService.listCards();
    }
}