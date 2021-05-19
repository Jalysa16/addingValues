package com.jalysa.garner.addingvalues.controller;

import com.jalysa.garner.addingvalues.entity.Values;
import com.jalysa.garner.addingvalues.service.AddingValuesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddingValuesController {

    public AddingValuesService addService = new AddingValuesService();

    @GetMapping("/")
    public String geeting(){
        return "Hi, My name is Jalysa Garner and welcome to my preassignment project";
    }

    @GetMapping(value = "/{value}")
    public Values addTen(@PathVariable("value") int value1){
        return new Values(addService.addTenToValue(value1));
    }

    @GetMapping(value="/{value1}/{value2}")
    public Values addTwoValues(@PathVariable("value1") int value1,@PathVariable("value2") int value2){
        return new Values(addService.addTwoValues(value1, value2));
    }






}
