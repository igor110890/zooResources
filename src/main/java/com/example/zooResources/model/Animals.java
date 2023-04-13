package com.example.zooResources.model;

import com.example.zooResources.model.enums.AnimalsSignPredator;
import com.example.zooResources.model.enums.AnimalsView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animals")
public class Animals {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "view")
    @Enumerated(EnumType.STRING)
    private AnimalsView view;

    @Column(name = "signPredator")
    @Enumerated(EnumType.STRING)
    private AnimalsSignPredator signPredator;

    @OneToMany(mappedBy = "animals")
    Set<DailyFoodAllowance> dailyFoodAllowance;
}
