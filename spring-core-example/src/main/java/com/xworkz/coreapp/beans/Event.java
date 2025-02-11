package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Event {

    public Event(){
        System.out.println("event cons invoked");
    }
    @Value("11")
    private int eventId;
    @Value("amith")
    private String name;
    @Value("vacation")
    private String eventType;
    @Value("leave for vacation")
    private String description;
}
