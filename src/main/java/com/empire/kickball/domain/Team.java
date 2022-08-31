package com.empire.kickball.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Team {

    @Id
    private long teamId;

    private String name;

    @ManyToOne
    @JoinColumn(name="captain_id", nullable=false)
    private Person captain;

    @ManyToOne
    @JoinColumn(name="seas_id", nullable=false)
    private Season season;

    @ManyToMany
    @JoinTable(name = "team_players",
            joinColumns = @JoinColumn(name = "pers_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Person> players;

}
