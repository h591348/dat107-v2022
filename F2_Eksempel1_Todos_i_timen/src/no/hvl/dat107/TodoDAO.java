package no.hvl.dat107;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TodoDAO {
	
	private EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("todoPersistenceUnit", 
			Map.of("javax.persistence.jdbc.password", new Passwords().getPassord()));
	
	/* --------------------------------------------------------------------- */

	public Todo finnTodoMedPk(int id) {
		
		EntityManager em = emf.createEntityManager();

		try {
			return em.find(Todo.class, id);

		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public String/*?*/ finnAlleTodos() {
		
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO* Bruke jpql Query*/
		
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public Todo  finnTodoMedTekst(/*TODO*/) {
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO*/
			
		} finally {
			em.close();
		}
	}
	
	/* --------------------------------------------------------------------- */

	public List<Todo> finnTodosMedTekst(String tekst) {
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO*/
		
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public boolean lagreNyTodo(int id, String tekst) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			Todo todo = new Todo(id, tekst);
			em.persist(todo);
			
			tx.commit();
			return true;

		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
		return false;
	}

	/* --------------------------------------------------------------------- */

	public void/*TODO*/ slettTodoMedPk(/*TODO*/) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			/*TODO*/
			
			tx.commit();

		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void/*TODO*/ oppdaterTodo(/*TODO*/) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			/*TODO*/
			
			tx.commit();
		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void/*TODO*/ oppdaterTekst(/*TODO*/) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			/*TODO*/
						
			tx.commit();
		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}
}
