package com.marcellus.cyclequeue.controller;

import com.marcellus.cyclequeue.model.Ticket;
import com.marcellus.cyclequeue.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final TicketService ticketService;

    @Autowired
    public HomeController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("ticket", new Ticket());
        return "home";
    }
    @PostMapping("/test")
    public String buttonTest(@ModelAttribute Ticket ticket, Model model){
        if(ticket.getType()==null){
            throw new RuntimeException();
        }

        Ticket savedTicket = ticketService.save(ticket);
        model.addAttribute("ticket", savedTicket);
        return "test";
    }
}
