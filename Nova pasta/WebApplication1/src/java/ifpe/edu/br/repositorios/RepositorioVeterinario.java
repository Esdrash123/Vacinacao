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
public class RepositorioVeterinario implements RepositorioGenerico<Veterinario, Integer> {

    List<Veterinario> listaVeterinarios = new ArrayList<>();

    @Override
    public void cadastrar(Veterinario t) {
        this.listaVeterinarios.add(t);
    }

    @Override
    public void remover(Veterinario t) {
        this.listaVeterinarios.remove(t);
    }

    @Override
    public void alterar(Veterinario t) {
        for (Veterinario v : this.listaVeterinarios) {
            if (v.getId() == t.getId()) {

                v.setId(t.getId());
                v.setCrv(t.getCrv());
                v.setNome(t.getNome());
                v.setEndereco(t.getEndereco());
                v.setTelefone(t.getTelefone());

            }

        }

    }

    @Override
    public Veterinario recuperar(Integer id) {
        for (Veterinario v : this.listaVeterinarios) {
            if (v.getNome().equals(id)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public List<Veterinario> recuperarTodos() {
        return this.listaVeterinarios;
    }

    
}
