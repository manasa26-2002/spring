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
public class Dominos {
    public Dominos(){
        System.out.println("dominos cons invoked");
    }
    @Value("9")
    private int id;
    @Value("corn cheese")
    private String pizzaName;
    @Value("299.90")
    private double price;
    @Value("cheese")
    private String type;
    @Value("3")
    private int quantity;
}
