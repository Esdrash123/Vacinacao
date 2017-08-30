/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author esdra
 */
@Entity
public class Vacina {
@Id
    private int id;
@Column(length = 20,nullable = false) 
    private String nome;
@Column(length = 20,nullable = false) 
    private String descricao;
@Column(length = 20,nullable = false) 
    private String composicao;
@Column(length = 20,nullable = false) 
    private String tempoEntreAplicacoes;
@Column(length = 20,nullable = false) 
    private double valor;
@Column(length = 20,nullable = false) 
    private int quantidadeAplicacao;
@Deprecated

    public Vacina(int id, String nome, String descricao, String composicao, String tempoEntreAplicacoes, double valor, int quantidadeAplicacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.composicao = composicao;
        this.tempoEntreAplicacoes = tempoEntreAplicacoes;
        this.valor = valor;
        this.quantidadeAplicacao = quantidadeAplicacao;
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

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getTempoEntreAplicacoes() {
        return tempoEntreAplicacoes;
    }

    public void setTempoEntreAplicacoes(String tempoEntreAplicacoes) {
        this.tempoEntreAplicacoes = tempoEntreAplicacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeAplicacao() {
        return quantidadeAplicacao;
    }

    public void setQuantidadeAplicacao(int quantidadeAplicacao) {
        this.quantidadeAplicacao = quantidadeAplicacao;
    }

}
