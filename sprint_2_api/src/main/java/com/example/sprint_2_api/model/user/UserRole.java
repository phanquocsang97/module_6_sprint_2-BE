package com.example.sprint_2_api.model.user;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser",referencedColumnName = "id")
    private AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "idRole",referencedColumnName = "id")
    private AppRole appRole;
}
