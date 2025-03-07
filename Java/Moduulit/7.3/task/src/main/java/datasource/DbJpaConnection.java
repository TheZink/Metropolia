package datasource;

import jakarta.persistence.*;

public class DbJpaConnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance(){
        System.out.println("Menimme getInstanceen");
        if (em == null) {
            System.out.println("Menimme em == null");
            try {
                if (emf == null) {
                    System.out.println("Menimme emf == null");
                    emf = Persistence.createEntityManagerFactory("currency");
                }

                em = emf.createEntityManager();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Fail : " + e.getMessage());
            }
        }
        return em;
    }
}
