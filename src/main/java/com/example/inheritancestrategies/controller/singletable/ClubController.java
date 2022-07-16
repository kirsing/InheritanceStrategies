package com.example.inheritancestrategies.controller.singletable;

import com.example.inheritancestrategies.model.singletable.Club;
import com.example.inheritancestrategies.repository.singletable.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/club")
public class ClubController {
        ClubRepository clubRepository;

        ClubController(ClubRepository clubRepository) {
            this.clubRepository = clubRepository;
        }

        @GetMapping
        public List<Club> getAll() {
            return clubRepository.findAll();
        }

        @PostMapping
        public Club post(@RequestBody Club club) {
            return clubRepository.save(club);
        }
        @DeleteMapping("/delete/event/{id}")
        public void deleteById(@PathVariable Long id) {
            clubRepository.deleteById(id);
        }
    }

