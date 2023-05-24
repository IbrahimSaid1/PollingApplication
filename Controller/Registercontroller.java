package com.codeline.PollingApplication.Controller;

import com.codeline.PollingApplication.Models.Register;
import com.codeline.PollingApplication.RequestObjects.GetRegisterRequestObject;
import com.codeline.PollingApplication.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Registercontroller {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/api/register")
    public void saveRegister(@RequestBody GetRegisterRequestObject registerRequestObject ){
        createRegister(registerRequestObject);}

    @RequestMapping("register/get")
    public List<Register> getRegister(){
        return registerService.getRegister();}





    public void createRegister(GetRegisterRequestObject registerRequestObject){
        Register register= new Register();
        register.setName(registerRequestObject.getName());
        register.setPassword(registerRequestObject.getPassword());
        registerService.saveRegister(register);
    }
}
