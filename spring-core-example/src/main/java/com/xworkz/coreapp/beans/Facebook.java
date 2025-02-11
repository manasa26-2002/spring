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
public class Facebook {
    public Facebook(){
        System.out.println("facebook cons invoked");
    }
    @Value("12")
    private int id;
    @Value("goutham")
    private String userName;
    @Value("goutham@gmail.com")
    private String email;
    @Value("9481664668")
    private long mobileNumber;
    @Value("goutham@8902")
    private String password;

}
