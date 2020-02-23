package com.marcellus.cyclequeue.service;

import com.marcellus.cyclequeue.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketServiceListImpl implements TicketService {

    private List<Ticket> tickets = new ArrayList<>();

    @Override
    public List<Ticket> findAll() {
        return new ArrayList<>(tickets);
    }

    @Override
    public Ticket findById(Long id) {
        return null;
    }

    @Override
    public Ticket save(Ticket ticket) {
        if(ticket != null){
            if(ticket.getId()==null){
                ticket.setId(getNextId());
            }
            ticket.setCreatedAt(new Date());
            tickets.add(ticket);
        }else {
            throw new RuntimeException("Ticket cannot be null!");
        }

        return ticket;
    }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Long.valueOf(tickets.size() +1);
        } catch(NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
