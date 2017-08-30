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
public class Raca {
@Id

    private int id;
@Column(length = 20,nullable = false) 
    private String nome;   
@Column(length = 20,nullable = false) 
    private String descricao;
@Column(length = 20,nullable = false) 
    private String caracteristica;

@Deprecated
    public Raca(int id, String nome, String caracteristica, String descricao) {
        this.id = id;
        this.nome = nome;
        this.caracteristica = caracteristica;
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

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
