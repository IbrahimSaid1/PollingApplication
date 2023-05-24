package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.PollVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PollVoteRepository extends JpaRepository<PollVote, Long> {
}
