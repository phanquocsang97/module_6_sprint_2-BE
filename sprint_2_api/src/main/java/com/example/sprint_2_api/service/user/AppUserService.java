package com.example.sprint_2_api.service.user;

import com.example.sprint_2_api.model.user.AppUser;
import com.example.sprint_2_api.repository.user.IAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    private IAppUserRepository appUserRepository;
    @Override
    public AppUser findByUsername(String userName) {
        return null;
    }

    @Override
    public Boolean createNewAppUser(AppUser appUser, String roleAdmin) {
        return null;
    }

    @Override
    public AppUser findByEmail(String email) {
        return null;
    }

    @Override
    public AppUser findUserById(Long idUser) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
