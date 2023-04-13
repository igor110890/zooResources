package com.example.zooResources.entity;

import com.example.zooResources.entity.enums.ProductsType;
import com.example.zooResources.entity.enums.ProductsUnitMeasurement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Products {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nameProducts")
    private String nameProducts;

    @Column(name = "currentQuantity")
    private String currentQuantity;

    @Column(name = "unitMeasurement ")
    @Enumerated(EnumType.STRING)
    private ProductsUnitMeasurement unitMeasurement;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ProductsType type;

    @OneToMany(mappedBy = "products")
    Set<DailyFoodAllowance> dailyFoodAllowance;
}

