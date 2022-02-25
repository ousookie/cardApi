package com.example.demo.rest;

import com.example.demo.enities.Employ;
import com.example.demo.services.implementations.EmployServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "employs")
public class EmployController {

    private final EmployServiceImplementation employServiceImplementation;

    @GetMapping
    public List<Employ> getEmploys(final Integer page, final Integer size) {
        return employServiceImplementation.employs(page, size);
    }

    @PostMapping
    public void createEmploy(@RequestBody Employ employ) {
        employServiceImplementation.createEmploy(employ);
    }

}
