package com.example.inheritancestrategies.controller.singletable;

import com.example.inheritancestrategies.model.singletable.Cinema;
import com.example.inheritancestrategies.model.singletable.Club;
import com.example.inheritancestrategies.repository.singletable.CinemaRepository;
import com.example.inheritancestrategies.repository.singletable.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinema")
public class CinemaController {
    CinemaRepository cinemaRepository;

    CinemaController(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @GetMapping
    public List<Cinema> getAll() {
        return cinemaRepository.findAll();
    }

    @PostMapping
    public Cinema post(@RequestBody Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
    @DeleteMapping("/delete/event/{id}")
    public void deleteById(@PathVariable Long id) {
        cinemaRepository.deleteById(id);
    }
}

