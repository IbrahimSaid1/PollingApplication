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



    @GetMapping("/polls")
    public ResponseEntity<Iterable<PollCreation>> getAllPolls() {
        Iterable<PollCreation> polls = pollCreationRepository.findAll();
        return new ResponseEntity<>(polls, HttpStatus.OK);
    }



    @PostMapping("/polls")
    public ResponseEntity<?> createPollCreation(@RequestBody PollCreation pollCreation){
        URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pollCreation.getId())
                .toUri();
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }


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
