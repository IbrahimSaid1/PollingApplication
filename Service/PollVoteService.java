package com.codeline.PollingApplication.Service;

import com.codeline.PollingApplication.Models.PollVote;
import com.codeline.PollingApplication.Repository.PollVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollVoteService {

    @Autowired
    PollVoteRepository pollVoteRepository;
    public void savePollVote(PollVote pollVote){
        pollVoteRepository.save(pollVote);
    }

}
