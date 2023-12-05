package com.example.sprint_2_api.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String email;


    @JsonBackReference
    @OneToMany(mappedBy = "appUser",fetch = FetchType.EAGER)
    private Set<UserRole> userRoleSet;
    public Set<UserRole> getUserRoleSet(){
        return userRoleSet;
    }
}
