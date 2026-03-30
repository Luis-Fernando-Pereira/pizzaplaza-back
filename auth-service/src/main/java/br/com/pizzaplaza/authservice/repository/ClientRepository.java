package br.com.pizzaplaza.authservice.repository;

import br.com.pizzaplaza.entity.systemactor.Client;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class ClientRepository {

    @Inject
    EntityManager em;

    public Client save(Client client) {
        em.persist(client);
        return client;
    }
}
