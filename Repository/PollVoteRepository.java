package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.PollVote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollVoteRepository extends JpaRepository<PollVote, Long> {
}
