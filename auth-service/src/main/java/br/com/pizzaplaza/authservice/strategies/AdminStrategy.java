package br.com.pizzaplaza.authservice.strategies;

import br.com.pizzaplaza.authservice.interfaces.UserStrategy;
import br.com.pizzaplaza.entity.dto.UserDto;

public class AdminStrategy implements UserStrategy {
    @Override
    public UserDto buildUser(UserDto userDto) {
        return null;
    }
}
