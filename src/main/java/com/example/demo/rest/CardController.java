package com.example.demo.rest;

import com.example.demo.enities.base.Card;
import com.example.demo.repos.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardRepository cardRepository;

    @GetMapping
    public List<Card> cardList() {
        return cardRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Card> cardList(@PathVariable(name = "id") String id) {
        return cardRepository.findById(id);
    }

    @PostMapping
    public void createCard(@RequestBody Card card) {
        cardRepository.save(card);
    }

}
