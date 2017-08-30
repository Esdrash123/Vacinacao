/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.entidades.Doenca;
import java.util.List;

/**
 *
 * @author ogi
 */
public class RepositorioDoencaImplBD implements RepositorioGenerico<Doenca, Integer >{

    @Override
    public void cadastrar(Doenca t) {
       PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Doenca t) {
        PersistenceDao.getInstance().delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Doenca t) {
         PersistenceDao.getInstance().update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doenca recuperar(Integer codigo) {
        try{
            return (Doenca)PersistenceDao.getInstance().read("select a from Doenca a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doenca> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Doenca a"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
