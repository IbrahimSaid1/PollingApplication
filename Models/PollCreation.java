package com.codeline.PollingApplication.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Data
@Entity
@Table(name = "choices")
public class PollCreation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POLL_ID")
    Long id;

    @Column(name = "QUESTION")
    String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Choices")
    String choices;
    @OrderBy
    Set<Option> options = new HashSet<>();

}
