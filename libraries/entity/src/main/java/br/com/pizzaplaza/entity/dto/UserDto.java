package br.com.pizzaplaza.entity.dto;


import br.com.pizzaplaza.entity.fatherofall.OdinDto;

public class UserDto extends OdinDto {
    public String name;
    public String cpf;
    public String email;
    public String password;
    public Type userType;

    public enum Type {ADMIN, CLIENT, SELLER}
}
