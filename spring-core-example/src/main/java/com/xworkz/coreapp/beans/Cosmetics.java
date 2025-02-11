package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
@Component
public class Cosmetics {

    public Cosmetics(){
        System.out.println("cosmetics cons invoked");
    }
    @Value("6")
    private int id;
    @Value("lipstick")
    private String name;
    @Value("lakme")
    private String brand;
    @Value("nude pink")
    private String shade;
    @Value("399")
    private double price;
}
