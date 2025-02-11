package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Component
public class Calender {

    public Calender(){
        System.out.println("calender cons invoked");
    }
    @Value("3")
    private int id;
    @Value("everyDay calender")
    private String name;
    @Value("80")
    private double price;
}
