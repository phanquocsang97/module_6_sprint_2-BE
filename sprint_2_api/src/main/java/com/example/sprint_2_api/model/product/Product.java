package com.example.sprint_2_api.model.product;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Double priceSale;
    private Integer quantity;
    private String description;
    private String ingredients;
    private String howToUse;
    private String intendedUser;
    private String packaging;
    private String storage;

    @ManyToOne
    @JoinColumn(name = "idCategory",referencedColumnName = "id")
    private Category category;
}
