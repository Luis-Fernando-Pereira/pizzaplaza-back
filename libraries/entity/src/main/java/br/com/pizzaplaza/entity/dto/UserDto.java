package br.com.pizzaplaza.entity.dto;


public class UserDto {
    public String name;
    public String cpf;
    public String email;
    public String password;
    public Type userType;

    public enum Type {ADMIN, CLIENT, SELLER}
}
