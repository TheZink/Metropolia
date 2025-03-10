package datasource;

import jakarta.persistence.*;

public class DbJpaConnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance(){
        if (em==null) {
            if (emf==null) {
                emf = Persistence.createEntityManagerFactory("converter");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}
