package com.example.sprint_2_api.dto.user;

import com.example.sprint_2_api.common.user.ValidateAppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUserLoginDto implements Validator {
    private Long id;
    private String userName;
    private String password;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        AppUserLoginDto appUserDto = (AppUserLoginDto) target;
        ValidateAppUser.checkValidateAppUserName(appUserDto.getUserName(), errors);
        ValidateAppUser.checkValidateAppUserPassword(appUserDto.getPassword(), errors);

    }
}
