package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Stand {

    @Value("1")
    private int id;
    @Value("250.90")
    private double price;
    @Value("onida")
    private String brandName;


//    @Autowired
//    public Stand(@Value("3") int id , @Value("onida") String brandName , @Value("250.90") double price){
//        this.id = id;
//        this.brandName = brandName;
//        this.price = price;
//    }


}
