package com.example.demo.services.implementations;

import com.example.demo.enities.Employ;
import com.example.demo.repos.EmployRepository;
import com.example.demo.services.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployServiceImplementation implements EmployService {

    private final EmployRepository employRepository;

    @Autowired
    public EmployServiceImplementation(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public List<Employ> employs(final Integer page, final Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return employRepository.findAll(pageRequest).getContent();
    }

    @Transactional
    public void createEmploy(Employ employ) {
        employRepository.save(employ);
    }

}
