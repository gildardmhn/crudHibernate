package ufc.com.test;

import ufc.com.DAO.LivroDAO;

public class Remover {

	public static void main(String[] args) {

		LivroDAO dao = new LivroDAO();
		dao.remover(2);
	}

}
