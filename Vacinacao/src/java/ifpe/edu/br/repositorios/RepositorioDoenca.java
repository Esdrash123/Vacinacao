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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esdra
 */
public class RepositorioDoenca implements RepositorioGenerico<Doenca, Integer> {
    
    List<Doenca> listaDoencas = new ArrayList<>();
    
    @Override
    public void cadastrar(Doenca t) {
        this.listaDoencas.add(t);
    }
    
    @Override
    public void remover(Doenca t) {
        this.listaDoencas.remove(t);
    }
    
    @Override
    public void alterar(Doenca t) {
        for (Doenca d : this.listaDoencas) {
            if (d.getId() == t.getId()) {
                
                d.setId(t.getId());
                d.setDescricao(t.getDescricao());
                d.setNome(t.getNome());
                
            }
            
        }
        
    }
    
    @Override
    public Doenca recuperar(Integer id) {
        for (Doenca d : this.listaDoencas) {
            if (d.getNome().equals(id)) {
                return d;
            }
        }
        return null;
    }
    
    @Override
    public List<Doenca> recuperarTodos() {
        return this.listaDoencas;
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
