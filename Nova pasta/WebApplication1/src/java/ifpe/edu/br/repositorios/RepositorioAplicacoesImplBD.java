/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.entidades.Aplicacoes;
import java.util.List;

/**
 *
 * @author ogi
 */
public class RepositorioAplicacoesImplBD implements RepositorioGenerico<Aplicacoes, Integer>{

    @Override
    public void cadastrar(Aplicacoes t) {
         PersistenceDao.getInstance().persist(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Aplicacoes t) {
        PersistenceDao.getInstance().delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Aplicacoes t) {
        PersistenceDao.getInstance().update(t);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aplicacoes recuperar(Integer codigo) {
        try{
            return (Aplicacoes)PersistenceDao.getInstance().read("select a from Aplicacoes a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aplicacoes> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Aplicacoes a"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
