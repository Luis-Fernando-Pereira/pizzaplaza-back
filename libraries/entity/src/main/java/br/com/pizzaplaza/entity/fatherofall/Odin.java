package br.com.pizzaplaza.entity.fatherofall;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class Odin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdUserWhoCreated() {
        return idUserWhoCreated;
    }

    public void setIdUserWhoCreated(Integer idUserWhoCreated) {
        this.idUserWhoCreated = idUserWhoCreated;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getIdUserWhoChanged() {
        return idUserWhoChanged;
    }

    public void setIdUserWhoChanged(Integer idUserWhoChanged) {
        this.idUserWhoChanged = idUserWhoChanged;
    }

    public Date getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Date changedAt) {
        this.changedAt = changedAt;
    }

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
