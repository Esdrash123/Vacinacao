/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.builder;
import ifpe.edu.br.entidades.Veterinario;
/**
 *
 * @author paulo
 */
public class BuilderVeterinario {

    public BuilderVeterinario(int id, String nome, String crv, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.crv = crv;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public BuilderVeterinario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
      private int id;
    private String nome;
    private String crv;
    private String endereco;
    private String telefone;
public Veterinario BuilderVeterinario(){
    return new Veterinario(id, nome, crv, endereco, telefone);
}
}
