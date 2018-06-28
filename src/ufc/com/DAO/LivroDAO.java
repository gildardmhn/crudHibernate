package ufc.com.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ufc.com.modelo.Livro;
public class LivroDAO {
	
	public void adicionar(Livro livro) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("crud-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
		System.out.println("Livro adicionado com sucesso");
		fabrica.close();
		manager.close();
	}
	
	public void remover(int id) {
			
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("crud-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		Livro livro = manager.find(Livro.class, id);
		manager.remove(livro);
		manager.getTransaction().commit();
		System.out.println("Livro removido com sucesso");
		fabrica.close();
		manager.close();
	}
	
	public void atualizar(Livro livro) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("crud-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(livro);
		manager.getTransaction().commit();
		System.out.println("Livro atualizado com sucesso");
		fabrica.close();
		manager.close();
	}
	
	public List<Livro> listar(){
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("crud-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Livro> livros = manager.createQuery("select l from Livro as l",Livro.class).getResultList();
		manager.close();
		fabrica.close();
		return livros;
	}
}
