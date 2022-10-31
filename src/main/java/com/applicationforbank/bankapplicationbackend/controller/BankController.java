package com.applicationforbank.bankapplicationbackend.controller;

import com.applicationforbank.bankapplicationbackend.bean.BankBean;
import com.applicationforbank.bankapplicationbackend.entity.BankEntity;
import com.applicationforbank.bankapplicationbackend.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//API for the host and is connected with service and controls the whole flow of spring boot

@RestController
@RequestMapping("/BankDetails")
@CrossOrigin("http://localhost:4200/")
public class BankController {

    @Autowired
    private BankService bankService;


    @PostMapping("/saveCustomerData")
    public Boolean customerDetails(@RequestBody BankBean saveCustomerBean){
        return bankService.saveCustomerData(saveCustomerBean);
    }

    @GetMapping("findCustomerId/{id}")
    public BankEntity findCustomerId(@PathVariable int id){
        return bankService.getCustomer(id);
    }

    @DeleteMapping("deleteCustomer/{id}")
    public Boolean deleteCustomerData(@PathVariable int id){
        return bankService.deleteCustomerData(id);
    }



}
