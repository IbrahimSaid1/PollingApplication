package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.PollCreation;
import com.codeline.PollingApplication.RequestObjects.GetPollCreationRequestObject;
import com.codeline.PollingApplication.Service.PollCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PollCreationController{

    @Autowired
    PollCreationService pollCreationService;

  c


    @RequestMapping("pollcreation/get")
    public List<PollCreation> getPollCreation(){
        return pollCreationService.getPollCreation();}




    @RequestMapping("poll/delete/{Id}")
    public void deletePollCreation(@PathVariable Long Id) {
        pollCreationService.deletePollCreationById(Id);
    }




    public void createPollCreation(GetPollCreationRequestObject pollCreationRequestObject){
        PollCreation pollCreation= new PollCreation();
        pollCreation.setQuestion(pollCreationRequestObject.getQuestion());
        pollCreation.setOption1(pollCreationRequestObject.getOption1());
        pollCreation.setOption2(pollCreationRequestObject.getOption2());
        pollCreation.setOption3(pollCreationRequestObject.getOption3());

        pollCreationService.savePollCreation(pollCreation);

    }
}
