package com.example.springfundamental.service;

import com.example.springfundamental.entity.Application;
import com.example.springfundamental.entity.Release;
import com.example.springfundamental.repository.ApplicationRepository;
import com.example.springfundamental.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService{

    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public List<Release> listReleases() {
        return (List<Release>) releaseRepository.findAll();
    }
}