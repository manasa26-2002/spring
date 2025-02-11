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
public class Spotify {
//    public Spotify(){
//        System.out.println("spotify cons invoked");
//    }
    private int id;
    private String userName;
    private String email;
    private String password;
    private long mobileNumber;

    @Autowired
    public  Spotify(@Value("21") int id , @Value("akash") String userName , @Value("akash@gmail.com") String email , @Value("akash2345") String password ,
                    @Value("9908276134") long mobileNumber){
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }
}
