package dao;

import entity.*;
import jakarta.persistence.*;

public class TransactionDao {

    public void persist(Transaction transaction) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.persist(transaction);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;    
        }
    }

    public Transaction find(int id) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        return em.createQuery("SELECT t FROM Transaction t WHERE t.id = :id", Transaction.class)
        .setParameter("id", id)
        .getSingleResult();
    }
}
