/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import ifpe.edu.br.entidades.Animal;
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

}
