package com.example.inheritancestrategies.model.singletable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue(value = "CINEMA")
public class Cinema extends Events {

    @Enumerated(value = EnumType.STRING)
    @Column(name = "movie_genre")
    private Genres genres;

    @Column(name = "movie_duration")
    private long duration;

}
