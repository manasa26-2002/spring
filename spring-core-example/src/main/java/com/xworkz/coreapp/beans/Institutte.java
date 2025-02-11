package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Component
public class Institutte {

    private int id;
    private String name;
    private int noOfTrainers;
    private int noOfTrainees;


    @Autowired
    public Institutte(@Value("15") int id , @Value("xworkz") String name ,
                      @Value("10") int noOfTrainers , @Value("250") int noOfTrainees){
        this.id = id;
        this.name= name;
        this.noOfTrainers = noOfTrainers;
        this.noOfTrainees = noOfTrainees;
    }
}
