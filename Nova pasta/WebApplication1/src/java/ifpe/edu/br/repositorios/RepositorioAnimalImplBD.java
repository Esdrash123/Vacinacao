/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Animal;
import java.util.List;

/**
 *
 * @author ogi
 */
public class RepositorioAnimalImplBD implements RepositorioGenerico<Animal,Integer>{

    @Override
    public void cadastrar(Animal t) {
        PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Animal t) {
        PersistenceDao.getInstance().delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Animal t) {
        PersistenceDao.getInstance().update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Animal recuperar(Integer codigo) {
       try{
            return (Animal)PersistenceDao.getInstance().read("select a from Animal a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Animal> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Animal a"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
