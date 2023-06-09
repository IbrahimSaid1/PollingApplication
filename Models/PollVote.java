package com.codeline.PollingApplication.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class PollVote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String choice;

}