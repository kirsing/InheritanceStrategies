package com.example.inheritancestrategies.model.singletable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue(value = "CLUB")
public class Club extends Events{

    @Column(name = "type_music")
    @Enumerated(value = EnumType.STRING)
    private Music music;

    @Column(name = "club_capacity")
    private double capacityOfDanceFloor;
}
