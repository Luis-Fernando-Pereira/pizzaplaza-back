package br.com.pizzaplaza.entity.fatherofall;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class Odin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer idUserWhoCreated;

    @Column
    private Date createdAt;

    @Column
    private Integer idUserWhoChanged;

    @Column
    private Date changedAt;

    public String toString() {
        return "criado por usuário: " + this.idUserWhoCreated;
    }
}
