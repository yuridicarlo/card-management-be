package com.cg.bnl.cardfsm.adapter.repository;

import com.cg.bnl.cardfsm.domain.model.Card;
import com.cg.bnl.cardfsm.port.repository.CardRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepositoryJDBC implements CardRepository {
    private final JdbcTemplate jdbcTemplate;

    public CardRepositoryJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createCard(String cardNumber, String cardType) {
        String sql = "INSERT INTO card (card_number, card_type, status) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, cardNumber, cardType, "active");
    }

    @Override
    public void deactivateCard(int cardId) {
        String sql = "UPDATE card SET status = ? WHERE id = ?";
        jdbcTemplate.update(sql, "inactive", cardId);
    }

    @Override
    public void deleteCard(int cardId) {
        String sql = "DELETE FROM card WHERE id = ?";
        jdbcTemplate.update(sql, cardId);
    }

    @Override
    public List<Card> listCards() {
        String sql = "SELECT * FROM card";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Card(
            rs.getInt("id"),
            rs.getString("card_number"),
            rs.getString("card_type"),
            rs.getString("status")
        ));
    }
}