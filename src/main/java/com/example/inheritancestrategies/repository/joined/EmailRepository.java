package com.example.inheritancestrategies.repository.joined;

import com.example.inheritancestrategies.model.joined.EmailNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailNotification, Long> {
}
