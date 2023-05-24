package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
