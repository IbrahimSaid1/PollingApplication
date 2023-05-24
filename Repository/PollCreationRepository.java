package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.PollCreation;
import org.springframework.stereotype.Repository;

@Repository
public class PollCreationRepository extends JpaRepository<PollCreation, Long> {


}
