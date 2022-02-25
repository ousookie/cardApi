package com.example.demo.enities.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Bonus {

    @Id
    private String name;

    private String src_img;

}
