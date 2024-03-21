import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Personne;
import model.Produit;



public class Test {

	public static void main(String[] args) {
	
			Personne personne =new Personne("KING", "Blacker");
			Produit produit=new Produit("Cosmétique",200);
			Produit produit2=new Produit("Cosmétique",200);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("contextJPA");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();

			em.persist(personne);
			em.persist(produit);
			em.getTransaction().commit();

			em.close();
			emf.close();

		}
	}


