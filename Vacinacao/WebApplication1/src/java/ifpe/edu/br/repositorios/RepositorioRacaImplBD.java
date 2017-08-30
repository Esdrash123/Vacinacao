/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Raca;
import java.util.List;

/**
 *
 * @author Meu
 */
public class RepositorioRacaImplBD implements RepositorioGenerico<Raca, Integer> {

    @Override
    public void cadastrar(Raca t) {
        PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Raca t) {
        PersistenceDao.getInstance().delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Raca t) {
          PersistenceDao.getInstance().update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Raca recuperar(Integer codigo) {
        try{
            return (Raca)PersistenceDao.getInstance().read("select a from Vacina a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Raca> recuperarTodos() {
         return PersistenceDao.getInstance().read("select a from Vacina a");//To change body of generated methods, choose Tools | Templates.
    }
    
}
