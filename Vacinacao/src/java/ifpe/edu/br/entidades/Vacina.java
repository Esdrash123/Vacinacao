/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.entidades;

/**
 *
 * @author esdra
 */
public class Vacina {

    private int id;
    private String nome;
    private String descricao;
    private String composicao;
    private String tempoEntreAplicacoes;
    private double valor;
    private int quantidadeAplicacao;

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
