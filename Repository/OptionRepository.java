package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.Option;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OptionRepository extends JpaRepository<Option, Long> {
}
