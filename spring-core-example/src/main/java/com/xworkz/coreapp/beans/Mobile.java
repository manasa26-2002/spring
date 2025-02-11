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
public class Mobile {
    public Mobile(){
        System.out.println("mobile cons invoked");
    }
    private int id;
    private String name;
    private int ram;
    private int rom;
    private String color;

    @Autowired
    public Mobile(@Value("17") int id, @Value("poco") String name ,
                  @Value("125") int ram , @Value("64") int rom , @Value("blue") String color){
        this.id= id;
        this. name = name;
        this.ram = ram;
        this.rom = rom;
        this.color= color;
    }
}
