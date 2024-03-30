package com.spring.project.contentcalenderv.controller;

import com.spring.project.contentcalenderv.config.ContentCalenderProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class HomeController {

    //for single value, this is a good way to do it.
//
//    @Value("${cc.welcomeMessage: Default Welcome Message}")
//    public String welcomeMessage;
//
//    @Value("${cc:about}")
//    private String about;
//    @GetMapping("/")
//    public Map<String,String> home(){
//        return Map.of("welcomeMessage",welcomeMessage, "about", about);
//    }

    //for several values, we can use the approach below: we added ContentCalenderProperties. R
    //we rebuilt our application
    // Now in the application.properties, we can type out cc and get it out

    private final ContentCalenderProperties properties;


    public HomeController(ContentCalenderProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/")

    public ContentCalenderProperties home() {
        return properties;
    }
}
