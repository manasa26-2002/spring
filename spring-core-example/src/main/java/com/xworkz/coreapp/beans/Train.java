package com.xworkz.coreapp.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@ToString
@Component
public class Train {
//    public Train(){
//        System.out.println("train cons invoked");
//    }
    private int id;
    private String name;
    private int noOfCompartments;
    private String source;
    private String destination;

    @Autowired
    public  Train(@Value("24") int id, @Value("hampi express") String name , @Value("15") int noOfCompartments ,
                  @Value("bangalore") String source , @Value("hubli") String destination){
        this.id =id;
        this.name = name;
        this.noOfCompartments = noOfCompartments;
        this.source = source;
        this.destination = destination;
    }
}
