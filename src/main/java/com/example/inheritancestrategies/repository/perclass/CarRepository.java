package com.example.inheritancestrategies.repository.perclass;

import com.example.inheritancestrategies.model.perclass.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
