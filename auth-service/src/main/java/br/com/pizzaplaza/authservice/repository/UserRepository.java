package br.com.pizzaplaza.authservice.repository;

import br.com.pizzaplaza.entity.systemactor.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class UserRepository {

    @Inject
    EntityManager em;

    public User save(User user) {
        em.persist(user);
        return user;
    }

}
