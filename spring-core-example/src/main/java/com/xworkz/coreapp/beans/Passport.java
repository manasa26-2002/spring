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
public class Passport {
    public Passport(){
        System.out.println("passport cons invoked");
    }
    private int id;
    private String firstName;
    private String lastName;
    private long contactNumber;
    private String email;

    @Autowired
    public Passport(@Value("18") int id , @Value("Mansa") String firstName , @Value("N S") String lastName ,
                    @Value("8867598126") long contactNumber , @Value("mansa@gmail.com") String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName= lastName;
        this.contactNumber = contactNumber;
        this.email = email;

    }
}
