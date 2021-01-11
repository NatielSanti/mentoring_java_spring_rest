package com.example.demo.dto;

import com.example.demo.entity.Customer;
import lombok.Data;

@Data
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
