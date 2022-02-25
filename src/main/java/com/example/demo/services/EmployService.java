package com.example.demo.services;

import com.example.demo.enities.Employ;

import java.util.List;

public interface EmployService {

    List<Employ> employs(final Integer page, final Integer size);

    void createEmploy(Employ employ);

}
