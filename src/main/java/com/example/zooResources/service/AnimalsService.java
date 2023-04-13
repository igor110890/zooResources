package com.example.zooResources.service;

import com.example.zooResources.entity.Animals;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimalsService {

    public List<Animals> findAll();

    public Animals findById(Long id);
}
