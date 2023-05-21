package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.Register;
import com.codeline.PollingApplication.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Registercontroller {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/api/register")
    public void saveRegister(){
        createRegister();
    }

    @RequestMapping("register/get")
    public List<Register> getRegister(){
        return registerService.getRegister();}





    public void createRegister(){
        Register register= new Register();
        register.setName("Ibrahim");
        register.setPassword("Ibr12345");
        registerService.saveRegister(register);
    }
}
