package dao;

import model.UsuarioPessoa;

public class DaoUsuario<E> extends DaoGeneric<UsuarioPessoa> {
	
	public void removerUsuario(UsuarioPessoa pessoa) throws Exception{
		getEntityManager().getTransaction().begin();
		/*	String sqlDelFone = "delete from telefoneuser where usuariopessoa_id = " + pessoa.getId();
		getEntityManager().createNativeQuery(sqlDelFone).executeUpdate();
		sqlDelFone = "delete from emailuser where usuariopessoa_id = " + pessoa.getId();
		getEntityManager().createNativeQuery(sqlDelFone).executeUpdate();*/

		getEntityManager().remove(pessoa);
		
		getEntityManager().getTransaction().commit();
		
		//super.deletarPorId(pessoa);
		
	}
	
}
