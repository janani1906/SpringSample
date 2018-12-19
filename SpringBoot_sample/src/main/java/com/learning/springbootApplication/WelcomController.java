package com.learning.springbootApplication;


import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.ErrorHandler;

@RestController
public class WelcomController implements ErrorController {

    private static final String PATH="/error";

    @RequestMapping("/")
    public String hello() {
        return "Hello World from Tomcat";
    }

    @RequestMapping("/error")
     public String error(){
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
