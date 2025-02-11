package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Bakery {
    @Value("2")
    private int id;
    @Value("warrior")
    private String bakeryName;
    @Value("8901456")
    private long gstNumber;
    @Value("vinay")
    private String ownerName;
}
