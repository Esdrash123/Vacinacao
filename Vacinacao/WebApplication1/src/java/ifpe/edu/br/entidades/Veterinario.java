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
public class Veterinario {
@Id
    private int id;
@Column(length = 20,nullable = false) 
    private String nome;
@Column(length = 20,nullable = false) 
    private String crv;
@Column(length = 20,nullable = false) 
    private String endereco;
@Column(length = 20,nullable = false) 
    private String telefone;
    @Deprecated

    public Veterinario(int id, String nome, String crv, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.crv = crv;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getCrv() {
        return crv;
    }

    public void setCrv(String crv) {
        this.crv = crv;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
