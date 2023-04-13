package com.example.zooResources.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dailyFoodAllowance")
public class DailyFoodAllowance {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animals animals;

    @ManyToOne
    @JoinColumn(name = "products_id")
    private Products products;

    @Column(name = "dailyAllowance")
    private String dailyAllowance;
}
