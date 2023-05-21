package com.codeline.PollingApplication.Controller;

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

}
