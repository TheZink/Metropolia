package dao;

import entity.*;
import java.util.List;
import jakarta.persistence.EntityManager;


public class CurrencyDao {

    // Metodi lisää valuutan tietokantaan
    public void persist(Currency currency) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.persist(currency);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;    
        }
    }

    // Metodi hakee valuutan tietokannasta
    public Currency find(String code) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        return em.createQuery("SELECT c FROM Currency c WHERE c.code = :code", Currency.class)
        .setParameter("code", code)
        .getSingleResult();
    }

    // Metodi hakee kaikki valuutat tietokannasta
    public List<Currency> findAll() {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        List<Currency> currList = em.createQuery("SELECT c FROM Currency c").getResultList();
        return currList;
    }
}
