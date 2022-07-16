package com.example.inheritancestrategies.repository.singletable;

import com.example.inheritancestrategies.model.singletable.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {
}
