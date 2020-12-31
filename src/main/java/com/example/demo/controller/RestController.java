package com.example.demo.controller;

import com.example.demo.dto.BodyDataDTO;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/data")
public class RestController {

    final private DataService dataService;

    public RestController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/add")
    private List<CustomerDTO> post(@RequestBody CustomerDTO data){
        return dataService.addCustomer(data);
    }

    @GetMapping(value = "/{id}")
    private CustomerDTO getOne(@PathVariable Integer id){
        return new CustomerDTO();
    }

    @RequestMapping(value = "/all", method = {RequestMethod.GET})
    private List<CustomerDTO> getAll(){
        return new ArrayList<>();
    }

    @PostMapping("/add/old")
    private BodyDataDTO oldPost(@RequestBody BodyDataDTO data){
        System.out.println("POST! Second");
        System.out.println("Data is " + data.getStr() + " " + data.getI());
        dataService.method();
        return new BodyDataDTO();
    }

}
