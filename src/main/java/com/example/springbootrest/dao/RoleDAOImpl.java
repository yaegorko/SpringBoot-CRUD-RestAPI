package com.example.springbootrest.dao;

import com.example.springbootrest.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void truncateAllRoles() {
        String stringQuery = "DELETE FROM Role";
        Query query = entityManager.createQuery(stringQuery);
        query.executeUpdate();
    }
}
