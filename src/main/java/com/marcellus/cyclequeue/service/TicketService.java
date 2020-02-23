package com.marcellus.cyclequeue.service;

import com.marcellus.cyclequeue.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll();
    Ticket findById(Long id);
    Ticket save(Ticket ticket);
}
