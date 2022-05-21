package com.example.springfundamental.repository;

import com.example.springfundamental.entity.Application;
import com.example.springfundamental.entity.Release;
import org.springframework.data.repository.CrudRepository;

public  interface ReleaseRepository extends CrudRepository<Release, Integer> {


}