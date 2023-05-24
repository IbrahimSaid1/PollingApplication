package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.PollCreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollCreationRepository extends JpaRepository<PollCreation, Long> {

}
