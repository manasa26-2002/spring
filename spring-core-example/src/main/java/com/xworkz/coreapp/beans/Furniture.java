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
public class Furniture {
    public Furniture(){
        System.out.println("furniture cons invoked");
    }
    @Value("13")
    private int id;
    @Value("dinning table")
    private String name;
    @Value("wodden")
    private String type;
    @Value("89760.90")
    private double cost;
    @Value("2")
    private int quantity;
}
