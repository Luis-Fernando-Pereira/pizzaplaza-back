package br.com.pizzaplaza.entity.systemactor;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Table
public class Client extends Person {

    @Column(unique = true)
    public String cpf;

    @JoinColumn(name="user_id")
    public User user;

}
