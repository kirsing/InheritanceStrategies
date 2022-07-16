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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (
        name = "EVENT_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "event_name")
    private String name;

    @Column(name = "event_price")
    private int price;

    @Column(name = "event_date")
    private Date date;
}
