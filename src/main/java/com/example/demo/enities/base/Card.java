package com.example.demo.enities.base;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


@Getter
@Setter
@Entity
public class Card {

    @Id
    private String id;

    @OneToMany
    private List<PaySystem> paySystems;

    @OneToMany
    private List<Bonus> bonus;

    private String type;

    private String info;

    private String cardNumber;

}
