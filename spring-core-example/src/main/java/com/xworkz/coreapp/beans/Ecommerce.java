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
public class Ecommerce {
    public Ecommerce(){
        System.out.println("ecommerce cons invoked");
    }
    @Value("10")
    private int id;
    @Value("amazon")
    private String name;
    @Value("2000987")
    private long users;
    @Value("shopping")
    private String type;
}
