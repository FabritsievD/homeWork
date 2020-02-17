package com.example.demo.controller;
import com.example.demo.model.DemoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    @Autowired
    DemoResponse demoResponse;

    @RequestMapping("/index")
    public DemoResponse getMessage() {
        demoResponse.setValue("World");
        return demoResponse;
    }
}
