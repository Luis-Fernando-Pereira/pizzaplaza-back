package br.com.pizzaplaza.authservice.interfaces;

import br.com.pizzaplaza.entity.dto.UserDto;

public interface UserStrategy {
    public UserDto save(UserDto userDto);
}
