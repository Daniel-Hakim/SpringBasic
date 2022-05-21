package com.example.springfundamental.service;

import com.example.springfundamental.entity.Application;
import com.example.springfundamental.entity.Ticket;
import com.example.springfundamental.repository.ApplicationRepository;
import com.example.springfundamental.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

}