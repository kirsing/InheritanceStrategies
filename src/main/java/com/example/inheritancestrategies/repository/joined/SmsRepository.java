package com.example.inheritancestrategies.repository.joined;

import com.example.inheritancestrategies.model.joined.SmsNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends JpaRepository<SmsNotification, Long> {
}
