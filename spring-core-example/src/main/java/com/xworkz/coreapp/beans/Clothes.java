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
public class Clothes {
    public Clothes(){
        System.out.println("clothes cons invoked");
    }
    @Value("4")
    private int id;
    @Value("baggy tshirt")
    private String name;
    @Value("300")
    private double price;
    @Value("cotton")
    private String fabric;
    @Value("white")
    private String color;
}
