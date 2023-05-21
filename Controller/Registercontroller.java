package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registercontroller {
    @Autowired
    RegisterService registerService;

    @RequestMapping("register/create")
    public void saveRegister(){
        createRegister();
    }


    public void createRegister(){
        Register register= new Register();
        register.setName("Ibrahim");
        register.setPassword("Ibr12345");
        registerService.saveRegister(register);
    }
}
