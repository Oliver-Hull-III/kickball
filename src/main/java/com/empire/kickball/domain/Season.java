package com.empire.kickball.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.DayOfWeek;
import java.util.Date;

@Entity
@Data
public class Season {

    @Id
    private long seasId;

    private Date startDate;
    private Date endDate;

    private DayOfWeek dayOfWeek;
}
