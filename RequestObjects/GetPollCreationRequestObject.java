package com.codeline.PollingApplication.RequestObjects;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetPollCreationRequestObject {

    String question;
    String option1;
    String option2;
    String option3;

}
