package com.example.inheritancestrategies.repository.perclass;

import com.example.inheritancestrategies.model.perclass.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
