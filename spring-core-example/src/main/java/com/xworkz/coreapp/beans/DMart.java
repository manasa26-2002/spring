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
public class DMart {

    public DMart(){
        System.out.println("dmart cons invoked");
    }

    @Value("8")
    private int id;
    @Value("marie light")
    private String biscuit;
    @Value("wheat")
    private String type;
    @Value("999.0")
    private double price;
    @Value("3")
    private int quantity;
}
