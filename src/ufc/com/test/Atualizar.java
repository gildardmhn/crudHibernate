package ufc.com.test;

import ufc.com.DAO.LivroDAO;
import ufc.com.modelo.Livro;

public class Atualizar {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setId(3);
		livro.setNomeLivro("GTA");
		livro.setCategoria("Games");
		
		LivroDAO dao = new LivroDAO();
		dao.atualizar(livro);

	}

}
