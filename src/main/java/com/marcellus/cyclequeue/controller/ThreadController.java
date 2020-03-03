package com.marcellus.cyclequeue.controller;

import com.marcellus.cyclequeue.thread.PrintThread;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreadController {

    private PrintThread printThread;

    public ThreadController(PrintThread printThread) {
        this.printThread = printThread;
    }

    @GetMapping("/thread")
    public String showThread(Model model){


        return "thread";
    }
}
