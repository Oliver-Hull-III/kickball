package com.empire.kickball.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class Game {

    @Id
    private long gameId;

    @ManyToOne
    @JoinColumn(name="ateam_id", nullable=false)
    private Team aTeam;

    @ManyToOne
    @JoinColumn(name="bteam_id", nullable=false)
    private Team bTeam;

    @ManyToOne
    @JoinColumn(name="referee_id", nullable=false)
    private Team refereeTeam;

    private long aTeamScore;

    private long bTeamScore;

    private Date gameDate;

    @ManyToOne
    @JoinColumn(name = "seas_id", nullable = false)
    private Season season;

}
