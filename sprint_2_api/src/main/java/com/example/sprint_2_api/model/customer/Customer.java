package com.example.sprint_2_api.model.customer;

import com.example.sprint_2_api.model.user.AppUser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "date")
    private String birthday;
    private String email;
    private String address;
    private Integer gender;
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "idUser",referencedColumnName = "id")
    private AppUser appUser;
}
