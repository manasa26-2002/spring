package com.xworkz.coreapp.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Company {
    public Company(){
        System.out.println("company cons invoked");
    }
    @Value("5")
    private int id;
    @Value("IBM")
    private String name;
    @Value("software")
    private String type;
    @Value("200")
    private long noOfEmployees;

}

