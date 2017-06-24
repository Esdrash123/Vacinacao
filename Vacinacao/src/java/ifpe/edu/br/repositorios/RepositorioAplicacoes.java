/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.entidades.Veterinario;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author esdra
 */
public class RepositorioAplicacoes implements RepositorioGenerico<Aplicacoes, Integer> {
    
    List<Aplicacoes> listaAplicacoes = new ArrayList<>();
    
    @Override
    public void cadastrar(Aplicacoes t) {
        this.listaAplicacoes.add(t);
    }
    
    @Override
    public void remover(Aplicacoes t) {
        this.listaAplicacoes.remove(t);
    }
    
    @Override
    public void alterar(Aplicacoes t) {
        for (Aplicacoes a : this.listaAplicacoes) {
            if (a.getId() == t.getId()) {
                
                a.setId(t.getId());
                a.setData(t.getData());
                a.setDataProxima(t.getDataProxima());
                a.setHora(t.getHora());
                a.setDescricao(t.getDescricao());
                
            }
            
        }
        
    }
    
    @Override
    public Aplicacoes recuperar(Integer id) {
        for (Aplicacoes a : this.listaAplicacoes) {
            if (a.getDescricao().equals(id)) {
                return a;
            }
        }
        return null;
    }
    
    @Override
    public List<Aplicacoes> recuperarTodos() {
        return this.listaAplicacoes;
    }

    @Override
    public void inserir(Animal animal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Aplicacoes aplicacoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Doenca doenca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Vacina vacina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Veterinario veterinario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Animal animal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Aplicacoes aplicacoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Doenca doenca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Raca raca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Veterinario veterinario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
