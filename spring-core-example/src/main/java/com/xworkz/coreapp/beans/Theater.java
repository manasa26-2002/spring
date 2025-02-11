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
public class Theater {
//    public Theater(){
//        System.out.println("theater cons invoked");
//    }
    private int id;
    private String name;
    private int noOfSeats;
    private int noOfMovies;
    private String address;

    @Autowired
    public Theater(@Value("23") int id , @Value("navrang") String name , @Value("250") int noOfSeats , @Value("2") int noOfMovies ,
                   @Value("navrang circle") String address){
        this.id= id;
        this.name= name;
        this.noOfMovies = noOfMovies;
        this.noOfSeats = noOfSeats;
        this.address = address;
    }
}
