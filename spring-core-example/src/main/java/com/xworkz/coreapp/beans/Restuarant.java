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
public class Restuarant {
    public Restuarant(){
        System.out.println("restuarant cons invoked");
    }
    private int id;
    private String name;
    private String type;
    private long noOfTables;
    private int noOfWaiters;

    @Autowired
    public Restuarant(@Value("19") int id , @Value("roots") String name , @Value("chinese") String type , @Value("58") int noOfTables ,
                       @Value("25") int noOfWaiters){
        this.id = id;
        this.name = name;
        this.type = type;
        this.noOfTables = noOfTables;
        this.noOfWaiters = noOfWaiters;
    }

}
