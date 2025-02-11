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
public class Decathlon {
    public Decathlon(){
        System.out.println("decathlon cons invoked");
    }
    @Value("7")
    private int id;
    @Value("shoes")
    private String name;
    @Value("2999")
    private double price;
    @Value("blue")
    private String color;
    @Value("running shoes")
    private String type;
}
