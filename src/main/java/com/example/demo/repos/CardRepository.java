package com.example.demo.repos;

import com.example.demo.enities.base.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, String> {
}
