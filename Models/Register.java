package com.codeline.PollingApplication.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Data
@Entity
public class Register{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "user_name")
    String name;
    String password;

}
