/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.br.edu.controladores;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.repositorios.RepositorioRacaImplBD;
import ifpe.edu.br.repositorios.RepositorioGenerico;
import ifpe.edu.br.repositorios.RepositorioRaca;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MEU
 */
@ManagedBean
@SessionScoped

public class RacaController {

    private RepositorioGenerico<Raca, Integer> repositorioRaca = new RepositorioRacaImplBD();

    public String cadastrar(Raca raca) {
    this.repositorioRaca.cadastrar(raca);
    
    FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage("A Raça "+raca.getNome()+" foi cadastrado com sucesso!" ));
            return "index.xhtml";
    }

    public void alterar(Raca raca) {
        this.repositorioRaca.alterar(raca);
    }

    public void remover(Raca raca) {
        this.repositorioRaca.remover(raca);
    }

    public Raca recuperar(Integer id) {
       return this.repositorioRaca.recuperar(id);
    }

    public List<Raca> recuperarTodos() {
        return this.repositorioRaca.recuperarTodos();
    }
}
