package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.Option;
import com.codeline.PollingApplication.Models.PollCreation;
import com.codeline.PollingApplication.Models.Register;
import com.codeline.PollingApplication.Repository.PollCreationRepository;
import com.codeline.PollingApplication.RequestObjects.GetPollCreationRequestObject;
import com.codeline.PollingApplication.RequestObjects.GetRegisterRequestObject;
import com.codeline.PollingApplication.Service.PollCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/polls")
public class PollCreationController{

    @Autowired
    PollCreationRepository pollCreationRepository;
    PollCreationService pollCreationService;

    PollCreationController(PollCreationRepository pollCreationRepository){
        this.pollCreationRepository= pollCreationRepository;
    }



    @RequestMapping("/api/pollcreation")
    public void savePollCreation(@RequestBody GetPollCreationRequestObject pollCreationRequestObject){
        createPollCreation(pollCreationRequestObject);
    }


    @RequestMapping("pollcreation/get")
    public List<PollCreation> getPollCreation(){
        return pollCreationService.getPollCreation();}


    public void createPollCreation(GetPollCreationRequestObject pollCreationRequestObject){
        PollCreation pollCreation= new PollCreation();
        //pollCreation.setQuestion(pollCreationRequestObject.getQuestion());
        pollCreation.setQuestion("What is your favorite color?");
        pollCreation.setOption1("Red");
        pollCreation.setOption2("Blue");
        pollCreation.setOption3("Green");
        pollCreationService.savePollCreation(pollCreation);

    }
}
