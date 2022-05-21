package com.example.springfundamental.controller;

import com.example.springfundamental.entity.Application;
import com.example.springfundamental.entity.Ticket;
import com.example.springfundamental.exception.ApplicationNotFoundException;
import com.example.springfundamental.service.ApplicationService;
import com.example.springfundamental.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/tza")
public class TZaController {

    private ApplicationService applicationService;
    private TicketService ticketService;

    public TZaController(ApplicationService applicationService, TicketService ticketService) {
        this.applicationService = applicationService;
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> ticketList=ticketService.listTickets();
        return new ResponseEntity<List<Ticket>>(ticketList, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications(){
        List<Application> applicationListList=applicationService.listApplications();
        return new ResponseEntity<List<Application>>(applicationListList, HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") Integer id) {

        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
    }

    }
}