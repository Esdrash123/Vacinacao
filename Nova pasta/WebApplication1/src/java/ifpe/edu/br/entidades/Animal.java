/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author esdra
 */
@Entity
public class Animal {
@Id
    private int id;
@Column(length = 20,nullable = false)   
    private String nome;
@Temporal(TemporalType.DATE)
    private Date nascimento;
@Column(length = 20,nullable = false)
    private double peso;
@Column(length = 20,nullable = false)
    private String caracteristicaIndividuais;
@Deprecated
public Animal(){}

    public Animal(int id, String nome, Date nascimento, double peso, String caracteristicaIndividuais) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
        this.caracteristicaIndividuais = caracteristicaIndividuais;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCaracteristicaIndividuais() {
        return caracteristicaIndividuais;
    }

    public void setCaracteristicaIndividuais(String caracteristicaIndividuais) {
        this.caracteristicaIndividuais = caracteristicaIndividuais;
    }
}
