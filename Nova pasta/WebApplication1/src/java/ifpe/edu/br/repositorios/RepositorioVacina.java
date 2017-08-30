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
public class RepositorioVacina implements RepositorioGenerico<Vacina, Integer> {

    List<Vacina> listaVacina = new ArrayList<>();

    @Override
    public void cadastrar(Vacina t) {
        this.listaVacina.add(t);
    }

    @Override
    public void remover(Vacina t) {
        this.listaVacina.remove(t);
    }

    @Override
    public void alterar(Vacina t) {
        for (Vacina v : this.listaVacina) {
            if (v.getId() == t.getId()) {

                v.setId(t.getId());
                v.setComposicao(t.getComposicao());
                v.setDescricao(t.getDescricao());
                v.setNome(t.getNome());
                v.setQuantidadeAplicacao(t.getQuantidadeAplicacao());
                v.setValor(t.getValor());
                v.setTempoEntreAplicacoes(t.getTempoEntreAplicacoes());

            }

        }

    }

    @Override
    public Vacina recuperar(Integer id) {
        for (Vacina v : this.listaVacina) {
            if (v.getNome().equals(id)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public List<Vacina> recuperarTodos() {
        return this.listaVacina;
    }

  
}
