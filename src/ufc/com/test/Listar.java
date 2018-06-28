package ufc.com.test;

import java.util.List;

import ufc.com.DAO.LivroDAO;
import ufc.com.modelo.Livro;

public class Listar {

	public static void main(String[] args) {
		LivroDAO dao = new LivroDAO();
		List<Livro> livros = dao.listar();

		for(Livro livro : livros) {
			System.out.println("id: " + livro.getId());
			System.out.println("Nome: " + livro.getNomeLivro());
			System.out.println("Categoria: " + livro.getCategoria());
		}
	}

}
