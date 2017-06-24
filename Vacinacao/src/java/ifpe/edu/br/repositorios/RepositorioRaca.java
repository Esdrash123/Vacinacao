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
public class RepositorioRaca implements RepositorioGenerico<Raca, Integer> {
    
    List<Raca> listaRaca = new ArrayList<>();
    
    @Override
    public void cadastrar(Raca t) {
        this.listaRaca.add(t);
    }
    
    @Override
    public void remover(Raca t) {
        this.listaRaca.remove(t);
    }
    
    @Override
    public void alterar(Raca t) {
        for (Raca r : this.listaRaca) {
            if (r.getId() == t.getId()) {
                
                r.setId(t.getId());
                r.setNome(t.getNome());
                r.setCaracteristica(t.getCaracteristica());
                r.setDescricao(t.getDescricao());
                
            }
            
        }
        
    }
    
    @Override
    public Raca recuperar(Integer id) {
        for (Raca d : this.listaRaca) {
            if (d.getNome().equals(id)) {
                return d;
            }
        }
        return null;
    }
    
    @Override
    public List<Raca> recuperarTodos() {
        return this.listaRaca;
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
