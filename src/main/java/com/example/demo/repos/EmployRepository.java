package com.example.demo.repos;

import com.example.demo.enities.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Long> {
}
