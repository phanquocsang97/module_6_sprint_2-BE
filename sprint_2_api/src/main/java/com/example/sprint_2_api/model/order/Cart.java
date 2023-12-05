package com.example.sprint_2_api.model.order;

import com.example.sprint_2_api.model.product.Product;
import com.example.sprint_2_api.model.user.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantityOrder;

    @ManyToOne
    @JoinColumn(name = "idProduct",referencedColumnName = "id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idUser",referencedColumnName = "id")
    private AppUser appUser;
}
