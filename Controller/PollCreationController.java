package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.PollCreation;
import com.codeline.PollingApplication.RequestObjects.GetPollCreationRequestObject;
import com.codeline.PollingApplication.Service.PollCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PollCreationController {

    @Autowired
    PollCreationService pollCreationService;

    @RequestMapping("/api/pollcreation")
    public void savePollCreation(@RequestBody GetPollCreationRequestObject pollCreationRequestObject){
        createPollCreation(pollCreationRequestObject);
    }



    @RequestMapping("pollcreation/get")
    public List<PollCreation> getPollCreation(){
        return pollCreationService.getPollCreation();}

    public void createPollCreation(GetPollCreationRequestObject pollCreationRequestObject){
        PollCreation pollCreation= new PollCreation();
        pollCreation.setQuestion(pollCreation.getQuestion());
        pollCreation.setChoices(pollCreation.getChoices());
        pollCreationService.savePollCreation(pollCreation);

    }
}
