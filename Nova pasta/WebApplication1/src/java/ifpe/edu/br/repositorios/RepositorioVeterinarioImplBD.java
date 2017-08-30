/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.entidades.Veterinario;
import java.util.List;

/**
 *
 * @author ogi
 */
public class RepositorioVeterinarioImplBD implements RepositorioGenerico<Veterinario, Integer>{

    @Override
    public void cadastrar(Veterinario t) {
        PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Veterinario t) {
        PersistenceDao.getInstance().delete(t);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Veterinario t) {
        PersistenceDao.getInstance().update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veterinario recuperar(Integer codigo) {
         try{
            return (Veterinario)PersistenceDao.getInstance().read("select a from Veterinario a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Veterinario> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Veterinario a"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
