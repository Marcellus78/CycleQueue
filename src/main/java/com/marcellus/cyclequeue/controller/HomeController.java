package com.marcellus.cyclequeue.controller;

import com.marcellus.cyclequeue.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final TicketService queueService;

    @Autowired
    public HomeController(TicketService queueService) {
        this.queueService = queueService;
    }

    @GetMapping("/")
    public String home(){

        return "home";
    }
    @PostMapping("/test")
    public String buttonTest(){
         return "test";
    }
}
