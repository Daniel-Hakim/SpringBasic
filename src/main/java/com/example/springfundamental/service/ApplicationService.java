package com.example.springfundamental.service;

import com.example.springfundamental.entity.Application;

import java.util.List;


public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(Integer id);

}