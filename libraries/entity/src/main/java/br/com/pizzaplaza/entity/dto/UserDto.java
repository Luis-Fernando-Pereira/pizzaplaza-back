package br.com.pizzaplaza.entity.dto;


import br.com.pizzaplaza.entity.fatherofall.OdinDto;

public class UserDto extends OdinDto {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getUserType() {
        return userType;
    }

    public void setUserType(Type userType) {
        this.userType = userType;
    }

    public String name;
    public String cpf;
    public String email;
    public String password;
    public Type userType;

    public enum Type {ADMIN, CLIENT, SELLER}
}
