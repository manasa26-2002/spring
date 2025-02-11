package com.xworkz.coreapp.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@ToString
@Component
public class Library {
    public Library(){
        System.out.println("library cons invoked");
    }
    private int id;
    private String name;
    private int noOfBooks;
    private int noOfCompartments;

    @Autowired
    public Library(@Value("16") int id , @Value("knowledge center") String name ,
                   @Value("10000") int noOfBooks , @Value("25") int noOfCompartments){
        this.id = id;
        this.name= name;
        this.noOfBooks = noOfBooks;
        this.noOfCompartments = noOfCompartments;
    }
}
