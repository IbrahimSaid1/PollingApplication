package com.codeline.PollingApplication.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Data
@Entity
public class Polls {
    String color;

    String a;
}
