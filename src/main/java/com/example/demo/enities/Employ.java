package com.example.demo.enities;

import com.example.demo.enities.base.Named;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "employ")
public class Employ extends Named {

    @Column(name = "salary", columnDefinition = "varchar(255)")
    private Long salary;

}
