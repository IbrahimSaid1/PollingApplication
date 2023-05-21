package com.codeline.PollingApplication.Service;

import com.codeline.PollingApplication.Models.Register;
import com.codeline.PollingApplication.Repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    RegisterRepository registerRepository;

    public void saveRegister(Register register){
        registerRepository.save(register);
    }

    public List<Register> getRegister() {return registerRepository.findAll();}
}


