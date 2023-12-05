package com.example.sprint_2_api.service.user;

import com.example.sprint_2_api.model.user.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends UserDetailsService {
    AppUser findByUsername(String userName);

    Boolean createNewAppUser(AppUser appUser, String roleAdmin);

    AppUser findByEmail(String email);

    AppUser findUserById(Long idUser);
}
