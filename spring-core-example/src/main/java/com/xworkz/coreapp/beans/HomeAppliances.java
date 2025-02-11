package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Component
public class HomeAppliances {

    private int id;
    private String name;
    private String type;
    private double price;
    private String color;
    private int quantity;

    @Autowired
    public HomeAppliances(@Value("14") int id , @Value("television") String name , @Value("electronic device") String type ,
                       @Value("89124.90") double price ,   @Value("black") String color , @Value("2") int quantity){
        this.id= id;
        this.name = name;
        this.type = type;
        this.price=price;
        this.color= color;
        this.quantity = quantity;
    }


}
