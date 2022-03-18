package no.hvl.dat107;

import java.util.Map;

import javax.persistence.*;

public class VitnemalDAO {

    private EntityManagerFactory emf;

    public VitnemalDAO() {
        emf = Persistence.createEntityManagerFactory("vitnemalPU",
		Map.of("javax.persistence.jdbc.password", new Passwords().getPassord()));
    }
    
    /* --------------------------------------------------------------------- */

    public Vitnemal hentVitnemalForStudent(int StudNr) {
        
        EntityManager em = emf.createEntityManager();
        try {
        	return em.find(Vitnemal.class, StudNr);
        } finally {
            em.close();
        }
    }

    /* --------------------------------------------------------------------- */

    public Karakter hentKarakterForStudentIEmne(int studNr, String emnekode) {
        
        EntityManager em = emf.createEntityManager();
        
        try {
            String q = "SELECT k FROM Karakter AS k WHERE k.vitnemal.studNr = :snr AND k.emnekode = :ekode";
            TypedQuery<Karakter> query = em.createQuery(q, Karakter.class);
            query.setParameter("snr", studNr);
            query.setParameter("ekode", emnekode);

          return query.getSingleResult();
        	
        }
        catch (NoResultException e){
            return null;
        }
        finally {
            em.close();
        }
    }
    
    /* --------------------------------------------------------------------- */

    public /*TODO*/void registrerKarakterForStudent(/*TODO*/) {
        
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        try {
        	tx.begin();
        	/*TODO*/
        	tx.commit();
        } finally {
            em.close();
        }
    }
   
}
















