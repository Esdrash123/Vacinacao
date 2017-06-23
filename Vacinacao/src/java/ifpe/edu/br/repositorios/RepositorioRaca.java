/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.entidades.Raca;
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
    
}
