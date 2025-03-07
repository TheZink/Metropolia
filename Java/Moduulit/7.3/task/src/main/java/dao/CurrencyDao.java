package dao;

import entity.*;
import java.util.List;
import jakarta.persistence.EntityManager;


public class CurrencyDao {

    // Metodi lisää valuutan tietokantaan
    public void persist(Currency currency) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    // Metodi hakee valuutan tietokannasta
    public Currency find(String name) {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        Currency currency = em.find(Currency.class, name);
        return currency;
    }

    // Metodi hakee kaikki valuutat tietokannasta
    public List<Currency> findAll() {
        EntityManager em = datasource.DbJpaConnection.getInstance();
        List<Currency> currList = em.createQuery("SELECT c FROM Currency c").getResultList();
        return currList;
    }
}
