package ufc.com.test;

import ufc.com.DAO.LivroDAO;
import ufc.com.modelo.Livro;

public class Adicionar {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNomeLivro("One Piece Vol 1");
		livro.setCategoria("Mangas");
		
		LivroDAO dao = new LivroDAO();
		dao.adicionar(livro);
	}

}
