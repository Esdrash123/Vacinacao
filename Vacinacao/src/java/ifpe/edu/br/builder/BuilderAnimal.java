/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.builder;
import java.util.Date;
import ifpe.edu.br.entidades.Animal;
/**
 *
 * @author paulo
 */
public class BuilderAnimal {

    public BuilderAnimal(int id, String nome, Date nascimento, double peso, String caracteristicaIndividuais) {
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
    private int id;
    private String nome;
    private Date nascimento;
    private double peso;
    private String caracteristicaIndividuais;
    
    public Animal BuilderAnimal(){
        return new Animal (id, nome, nascimento, peso, caracteristicaIndividuais);
    }
}
