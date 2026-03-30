package br.com.pizzaplaza.authservice.strategies;

import br.com.pizzaplaza.authservice.interfaces.UserStrategy;
import br.com.pizzaplaza.authservice.repository.UserRepository;
import br.com.pizzaplaza.entity.dto.UserDto;
import br.com.pizzaplaza.entity.systemactor.Client;
import br.com.pizzaplaza.entity.systemactor.User;
import io.vertx.core.cli.InvalidValueException;
import io.vertx.core.cli.Option;
import jakarta.inject.Inject;

public class ClientStrategy implements UserStrategy {

    @Inject
    UserRepository repository;

    @Override
    public UserDto buildUser(UserDto userDto) {
        if (!isUserDtoValid(userDto)) {
            throw new InvalidValueException(new Option(),"Usuário inválido");
        }

        User user = new User();

        user.setEmail(userDto.email);
        user.setPassword(userDto.password);
        user.setAuthenticated(false);

        repository.save(user);

        Client client = new Client();

        client.user = user;
        client.cpf = userDto.cpf;
        client.name = userDto.name;


        return null;
    }

    public Boolean isUserDtoValid(UserDto userDto) {
        if (userDto == null) {
            return false;
        }

        if (isEmailValid(userDto.email)) {
            return false;
        }

        if (isPasswordValid(userDto.password)) {
            return false;
        }

        if (isCpfValid(userDto.cpf)) {
            return false;
        }

        return true;
    }

    public Boolean isPasswordValid(String password) {
        return password == null || password.isEmpty() || password.isBlank();
    }

    public Boolean isEmailValid(String email) {
        return email != null && !email.isEmpty() && !email.isBlank();
    }

    public Boolean isCpfValid(String cpf) {
        return cpf == null || cpf.isEmpty() || cpf.isBlank();
    }
}
