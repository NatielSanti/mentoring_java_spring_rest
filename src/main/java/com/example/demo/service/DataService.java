package com.example.demo.service;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataService {

    private static final Logger log = LoggerFactory.getLogger(DataService.class);
    private final CustomerRepository repository;

    public DataService(CustomerRepository repository){
        this.repository = repository;
    }

    public List<CustomerDTO> addCustomer(CustomerDTO dto){
        Customer customer = new Customer(dto.getId(), dto.getFirstName(), dto.getLastName());
        repository.save(customer);
        List<Customer> all = repository.findAll();
        return all.stream().map(CustomerDTO::new).collect(Collectors.toList());
    }
}
