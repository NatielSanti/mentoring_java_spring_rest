package com.example.demo.dto;

import com.example.demo.entity.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;

    public CustomerDTO(){}

    public CustomerDTO(Customer customer){
        this.id = customer.getId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
