package com.example.springfundamental.repository;

import com.example.springfundamental.entity.Application;
import org.springframework.data.repository.CrudRepository;

public  interface ApplicationRepository extends CrudRepository<Application, Integer> {


}