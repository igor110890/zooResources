package com.example.zooResources.repository;

import com.example.zooResources.entity.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {

    @Query("select distinct a from Animals a")
    List<Animals> findAll();
}
