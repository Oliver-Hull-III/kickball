package com.empire.kickball.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long persId;

    private String fName;
    private String lName;

    @ManyToMany(mappedBy = "players")
    List<Team> teams;
}
