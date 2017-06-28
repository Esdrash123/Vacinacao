/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.builder;
import ifpe.edu.br.entidades.Aplicacoes;
import java.util.Date;

/**
 *
 * @author paulo
 */
public class BuilderAplicacoes {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataProxima() {
        return dataProxima;
    }

    public void setDataProxima(Date dataProxima) {
        this.dataProxima = dataProxima;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private int id;
    private Date data;
    private Date dataProxima;
    private int hora;
    private String descricao;

    public BuilderAplicacoes() {
    }

    
    public BuilderAplicacoes(int id, Date data, Date dataProxima, int hora, String descricao) {
        this.id = id;
        this.data = data;
        this.dataProxima = dataProxima;
        this.hora = hora;
        this.descricao = descricao;
    }
    public Aplicacoes BuilderAplicacoes(){
        return new Aplicacoes(id, data, dataProxima, hora, descricao);
    }
}
