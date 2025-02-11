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
public class Airways {
    public Airways(){
        System.out.println("airways cons invoked");
    }
    @Value("1")
    private int id;
    @Value("QATAR Airways")
    private String name;
    @Value("20")
    private int  noOfAirHosters;
    @Value("2")
    private int noOfPilots;
    @Value("250")
    private int noOfPassengers;
    @Value("3")
    private int noOfCompartments;
}
