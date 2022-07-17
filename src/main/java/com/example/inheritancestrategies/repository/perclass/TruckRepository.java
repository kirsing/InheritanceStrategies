package com.example.inheritancestrategies.repository.perclass;

import com.example.inheritancestrategies.model.perclass.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
