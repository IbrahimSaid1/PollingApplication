package com.codeline.PollingApplication.Controller;


import com.codeline.PollingApplication.Models.PollVote;
import com.codeline.PollingApplication.Repository.PollVoteRepository;
import com.codeline.PollingApplication.RequestObjects.GetPollVoteRequestObject;
import com.codeline.PollingApplication.Service.PollVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PollVoteController {
    @Autowired
    PollVoteService pollVoteService;
    PollVoteRepository pollVoteRepository;
    @RequestMapping("/api/polls/vote")
    public void savePollCreation(@RequestBody GetPollVoteRequestObject pollVoteRequestObject){
        createPollVote(pollVoteRequestObject);
    }


    @RequestMapping("pollVote/get")
    public List<PollVote> getPollVote(){
        return pollVoteService.getPollVote();}

    @GetMapping("/count/{Choice}")
    public long countOccurrences(@PathVariable("Choice") String choice) {
        return pollVoteService.countOccurrences(choice);
    }

    public void createPollVote(GetPollVoteRequestObject pollVoteRequestObject){
        PollVote pollVote= new PollVote();
        pollVote.setChoice(pollVoteRequestObject.getChoice());
        pollVoteService.savePollVote(pollVote);

    }

}
