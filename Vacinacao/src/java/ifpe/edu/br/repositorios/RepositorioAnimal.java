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
public class RepositorioAnimal implements RepositorioGenerico<Animal, Integer> {

    List<Animal> listaAnimais = new ArrayList<>();

    @Override
    public void cadastrar(Animal t) {
        this.listaAnimais.add(t);
    }

    @Override
    public void remover(Animal t) {
        this.listaAnimais.remove(t);
    }

    @Override
    public void alterar(Animal t) {
        for (Animal a : this.listaAnimais) {
            if (a.getId() == t.getId()) {

                a.setId(t.getId());
                a.setNascimento(t.getNascimento());
                a.setCaracteristicaIndividuais(t.getCaracteristicaIndividuais());
                a.setNome(t.getNome());
                a.setPeso(t.getPeso());
            }

        }

    }

    @Override
    public Animal recuperar(Integer id) {
        for (Animal a : this.listaAnimais) {
            if (a.getNome().equals(id)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Animal> recuperarTodos() {
        return this.listaAnimais;
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
