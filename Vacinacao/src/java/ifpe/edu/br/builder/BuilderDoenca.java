/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.builder;

import ifpe.edu.br.entidades.Doenca;

/**
 *
 * @author paulo
 */
public class BuilderDoenca {

    public BuilderDoenca(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private int id;
    private String nome;
    private String descricao;

    public Doenca BuilderDoenca() {
        return new Doenca(id, nome, descricao);
    }
}
