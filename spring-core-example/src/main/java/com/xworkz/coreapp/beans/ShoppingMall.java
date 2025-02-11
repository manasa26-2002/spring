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
public class ShoppingMall {
//    public ShoppingMall(){
//        System.out.println("shoppingmall cons invoked");
//    }
    private int id;
    private String shopName;
    private int noOfEmployees;
    private int noOfManagers;
    private long gstNumber;

    @Autowired
    public ShoppingMall(@Value("20") int id , @Value("zara") String name , @Value("20") int noOfEmployees ,
                        @Value("5")int noOfManagers , @Value("701276409") long gstNumber){
        this.id= id;
        this.shopName = shopName;
        this.noOfEmployees = noOfEmployees;
        this.noOfManagers  =noOfManagers;
        this.gstNumber = gstNumber;
    }
}
