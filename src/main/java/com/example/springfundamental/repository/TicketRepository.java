package com.example.springfundamental.repository;

import com.example.springfundamental.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}