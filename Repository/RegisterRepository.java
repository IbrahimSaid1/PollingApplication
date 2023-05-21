package com.codeline.PollingApplication.Repository;

import com.codeline.PollingApplication.Models.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface RegisterRepository extends JpaRepository<Register, Long> {

    }

