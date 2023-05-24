package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.PollCreation;
import com.codeline.PollingApplication.Repository.PollCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/api/polls")
public class PollCreationController{

    @Autowired
    PollCreationRepository pollCreationRepository;

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

}
