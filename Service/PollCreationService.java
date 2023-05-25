package com.codeline.PollingApplication.Service;

import com.codeline.PollingApplication.Models.PollCreation;
import com.codeline.PollingApplication.Repository.PollCreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollCreationService {

    @Autowired
    PollCreationRepository pollCreationRepository;
    public void savePollCreation(PollCreation pollCreation){
        pollCreationRepository.save(pollCreation);
    }

    public List<PollCreation> getPollCreation() {return pollCreationRepository.findAll();}

    public void deletePollCreationById(Long pollCreationId) {
        pollCreationRepository.deleteById(pollCreationId);
    }


}
