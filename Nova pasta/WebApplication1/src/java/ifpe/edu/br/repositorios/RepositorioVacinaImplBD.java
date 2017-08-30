/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.entidades.Vacina;
import java.util.List;

/**
 *
 * @author ogi
 */
public class RepositorioVacinaImplBD implements RepositorioGenerico<Vacina, Integer> {

    @Override
    public void cadastrar(Vacina t) {
        PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Vacina t) {
        PersistenceDao.getInstance().delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Vacina t) {
          PersistenceDao.getInstance().update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vacina recuperar(Integer codigo) {
        try{
            return (Vacina)PersistenceDao.getInstance().read("select a from Vacina a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vacina> recuperarTodos() {
         return PersistenceDao.getInstance().read("select a from Vacina a");//To change body of generated methods, choose Tools | Templates.
    }
    
}
