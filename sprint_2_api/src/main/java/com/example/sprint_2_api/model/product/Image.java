package com.example.sprint_2_api.model.product;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "LONGTEXT")
    private String name;

    @ManyToOne
    @JoinColumn(name = "idProduct",referencedColumnName = "id")
    private Product product;
}
