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
public class Uber {
//    public Uber(){
//        System.out.println("uber cons invoked");
//    }
    private int id;
    private String name;
    private String type;
    private long noOfAutorickshaw;

    @Autowired
    public Uber(@Value("25") int id , @Value("uber") String name ,
                @Value("transportation") String type , @Value("900087") long noOfAutorickshaw){
        this.id = id;
        this.name = name;
        this.noOfAutorickshaw = noOfAutorickshaw;
        this.type = type;
    }
}
