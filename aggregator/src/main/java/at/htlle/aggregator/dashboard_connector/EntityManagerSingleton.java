package at.htlle.aggregator.dashboard_connector;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class EntityManagerSingleton {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    private EntityManagerSingleton() {
    }
    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("validate-db");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
    public static void closeEntityManager() {
        if (entityManager != null) {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}