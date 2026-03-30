package br.com.pizzaplaza.authservice.interfaces;

import br.com.pizzaplaza.entity.dto.UserDto;

public interface UserStrategy {
    public UserDto buildUser(UserDto userDto);
}
