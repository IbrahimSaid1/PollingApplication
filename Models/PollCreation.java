package com.codeline.PollingApplication.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class PollCreation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long Id;
    String question;
    String option1;
    String option2;
    String option3;





}