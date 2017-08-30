/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.builder;

import ifpe.edu.br.entidades.Raca;

/**
 *
 * @author paulo
 */
public class BuilderRaca {

    public BuilderRaca(int id, String nome, String descricao, String caracteristica) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.caracteristica = caracteristica;
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

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    private int id;
    private String nome;
    private String descricao;
    private String caracteristica;

    public Raca BuilderRaca() {
        return new Raca(id, nome, caracteristica, descricao);
    }
}
