package com.xworkz.coreapp.Runner;

import com.xworkz.coreapp.beans.*;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunnner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Stand stand  =  applicationContext.getBean(Stand.class);
        //stand.setId(1);
        //stand.setBrandName("Nilkamal");
        //stand.setPrice(500.56);
        System.out.println(stand);

        Bakery bakery =  applicationContext.getBean(Bakery.class);
//        bakery.setId(2);
//        bakery.setBakeryName("renuka bakery");
//        bakery.setOwnerName("amith");
//        bakery.setGstNumber(89453201l);
        System.out.println(bakery);

        Event event = applicationContext.getBean(Event.class);
//        event.setEventId(3);
//        event.setName("akash");
//        event.setEventType("vacation");
//        event.setDescription("leave for vacation");
        System.out.println(event);

        Calender calender =  applicationContext.getBean(Calender.class);
//        calender.setId(4);
//        calender.setName("everyDay");
//        calender.setPrice(90);
        System.out.println(calender);

        Institutte institutte = applicationContext.getBean(Institutte.class);
//        institutte.setId(5);
//        institutte.setName("xworkz");
//        institutte.setNoOfTrainers(12);
//        institutte.setNoOfTrainees(590);
        System.out.println(institutte);

        Cosmetics cosmetics = applicationContext.getBean(Cosmetics.class);
//        cosmetics.setId(6);
//        cosmetics.setName("lipstick");
//        cosmetics.setBrand("maybelline");
//        cosmetics.setShade("nude pink");
//        cosmetics.setPrice(699.0);
        System.out.println(cosmetics);

        DMart dMart =  applicationContext.getBean(DMart.class);
//        dMart.setId(7);
//        dMart.setBiscuit("marie light");
//        dMart.setType("wheat flour");
//        dMart.setPrice(99.90);
//        dMart.setQuantity(50);
        System.out.println(dMart);

       Ecommerce ecommerce =  applicationContext.getBean(Ecommerce.class);
//        ecommerce.setId(8);
//        ecommerce.setName("amazon");
//        ecommerce.setType("shopping");
//        ecommerce.setUsers(389671098l);
        System.out.println(ecommerce);

      Facebook facebook =  applicationContext.getBean(Facebook.class);
//        facebook.setId(9);
//        facebook.setUserName("arjun");
//        facebook.setEmail("arjungouda@gmail.com");
//        facebook.setPassword("arjun456");
//        facebook.setMobileNumber(8809723410l);
        System.out.println(facebook);

        Passport passport = applicationContext.getBean(Passport.class);
//        passport.setId(10);
//        passport.setFirstName("vinay");
//        passport.setLastName("M");
//        passport.setEmail("vinayvinni@gmail.com");
//        passport.setContactNumber(7092360812l);
        System.out.println(passport);

        Decathlon decathlon = applicationContext.getBean(Decathlon.class);
//        decathlon.setId(11);
//        decathlon.setName("bicycle");
//        decathlon.setColor("blue");
//        decathlon.setPrice(12500.80);
        decathlon.setType("electric cycle");

       ShoppingMall shoppingMall = applicationContext.getBean(ShoppingMall.class);
//       shoppingMall.setId(12);
//       shoppingMall.setShopName("zara");
//       shoppingMall.setNoOfEmployees(50);
//       shoppingMall.setNoOfManagers(3);
//       shoppingMall.setGstNumber(801230745l);
        System.out.println(shoppingMall);

        Theater theater = applicationContext.getBean(Theater.class);
//        theater.setId(13);
//        theater.setName("navrang");
//        theater.setNoOfSeats(350);
//        theater.setAddress("navrang circle");
//        theater.setNoOfMovies(2);
        System.out.println(theater);


       Library library =  applicationContext.getBean(Library.class);
//        library.setId(14);
//        library.setName("knowledge center");
//        library.setNoOfBooks(9999);
//        library.setNoOfCompartments(100);
        System.out.println(library);

        Spotify spotify = applicationContext.getBean(Spotify.class);
//        spotify.setId(15);
//        spotify.setUserName("kushi");
//        spotify.setEmail("kushi89@gmail.com");
//        spotify.setPassword("kushi209");
//        spotify.setMobileNumber(8806207613l);
        System.out.println(spotify);

        HomeAppliances homeAppliances = applicationContext.getBean(HomeAppliances.class);
//        homeAppliances.setId(16);
//        homeAppliances.setName("dining table");
//        homeAppliances.setType("wodden");
//        homeAppliances.setQuantity(49);
//        homeAppliances.setColor("brown");
//        homeAppliances.setPrice(1898902.90);
        System.out.println(homeAppliances);


        Mobile mobile = applicationContext.getBean(Mobile.class);
//        mobile.setId(17);
//        mobile.setName("poco");
//        mobile.setColor("blue");
//        mobile.setRom(64);
//        mobile.setRam(120);
        System.out.println(mobile);

        Dominos dominos = applicationContext.getBean(Dominos.class);
//        dominos.setId(18);
//        dominos.setPizzaName("crispy corn");
//        dominos.setType("chesse");
//        dominos.setPrice(350.6);
//        dominos.setQuantity(5);
        System.out.println(dominos);

       Restuarant restuarant =  applicationContext.getBean(Restuarant.class);
//        restuarant.setId(19);
//        restuarant.setName("empire");
//        restuarant.setType("chinese");
//        restuarant.setNoOfTables(8712309l);
//        restuarant.setNoOfWaiters(9999);
        System.out.println(restuarant);

        Train train = applicationContext.getBean(Train.class);
//        train.setId(20);
//        train.setName("hampi express");
//        train.setNoOfCompartments(25);
//        train.setSource("bangalore");
//        train.setDestination("hubli");
        System.out.println(train);

        Airways airways = applicationContext.getBean(Airways.class);
//        airways.setId(21);
//        airways.setName("qatar airways");
//        airways.setNoOfCompartments(3);
//        airways.setNoOfPilots(2);
//        airways.setNoOfPassengers(200);
//        airways.setNoOfAirHosters(15);
        System.out.println(airways);

        Clothes clothes = applicationContext.getBean(Clothes.class);
//        clothes.setId(22);
//        clothes.setName("baggy tshirt");
//        clothes.setColor("black");
//        clothes.setFabric("cotton");
//        clothes.setPrice(850.90);
        System.out.println(clothes);

        Furniture furniture = applicationContext.getBean(Furniture.class);
//        furniture.setId(23);
//        furniture.setName("sofa set");
//        furniture.setType("wodden");
//        furniture.setCost(690000.00);
//        furniture.setQuantity(3);
        System.out.println(furniture);

        Company company = applicationContext.getBean(Company.class);
//        company.setId(24);
//        company.setName("verifone");
//        company.setType("finance");
//        company.setNoOfEmployees(4093126l);
        System.out.println(company);

        Uber uber = applicationContext.getBean(Uber.class);
//        uber.setId(25);
//        uber.setName("uber");
//        uber.setType("transport");
//        uber.setNoOfAutorickshaw(999);
        System.out.println(uber);




    }
}
