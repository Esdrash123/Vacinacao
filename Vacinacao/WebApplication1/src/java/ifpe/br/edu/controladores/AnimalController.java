/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.br.edu.controladores;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.repositorios.RepositorioAnimalImplBD;
import ifpe.edu.br.repositorios.RepositorioGenerico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ogi
 */
@ManagedBean
@SessionScoped

public class AnimalController {

    private RepositorioGenerico<Animal, Integer> repositorioAnimal = new RepositorioAnimalImplBD();

    public String cadastrar(Animal animal) {
    this.repositorioAnimal.cadastrar(animal);
    
    FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage("O Animal "+animal.getNome()+" foi cadastrado com sucesso!" ));
            return "index.xhtml";
    }

    public void alterar(Animal animal) {
        this.repositorioAnimal.alterar(animal);
    }

    public void remover(Animal animal) {
        this.repositorioAnimal.remover(animal);
    }

    public Animal recuperar(Integer codigo) {
       return this.repositorioAnimal.recuperar(codigo);
    }

    public List<Animal> recuperarTodos() {
        return this.repositorioAnimal.recuperarTodos();
    }
}
