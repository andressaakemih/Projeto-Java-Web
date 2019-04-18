import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Persistidor {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("obras");
            EntityManager em = emf.createEntityManager();
    
        ObraDeArte obras = new ObraDeArte();
        obras.setTitulo("");
        obras.setTecnica("");
        obras.setDimensoes_fiscais("");
        obras.setAuthor("");
        obras.setProcedencia("");
        obras.setTipo("");
        obras.setCaminho("");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obras);
        tx.commit();
        
        em.close();
        emf.close();
 
    }
}

