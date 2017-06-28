/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.fachada;

import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.repositorios.FabricaRepositorio;
import ifpe.edu.br.repositorios.RepositorioAplicacoes;
import ifpe.edu.br.repositorios.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class Fachada {
    
    private static Fachada myself = null;
    
    private RepositorioGenerico<Animal,String> repositorioAnimal = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioAplicacoes = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioDoenca = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioRaca = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioVacina = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioVeterinario = null;
    
    private Fachada(){
        this.repositorioAnimal = FabricaRepositorio.manufactor(FabricaRepositorio.ANIMAL, 
                FabricaRepositorio.MEMORIA);
        this.repositorioAplicacoes = FabricaRepositorio.manufactor(FabricaRepositorio.APLICACOES, 
                FabricaRepositorio.MEMORIA);
        this.repositorioDoenca = FabricaRepositorio.manufactor(FabricaRepositorio.ANIMAL, 
                FabricaRepositorio.MEMORIA);
    }
      
    public static Fachada getInstance(){
        if(myself == null)
            myself = new Fachada();
        
        return myself;
    }
    
    //ANIMAL
    public void inserir(Animal animal){
        this.repositorioAnimal.cadastrar(animal);
    }
    
    public void alterar(Animal animal){
        this.repositorioAnimal.alterar(animal);
    }
    
    public Animal recuperarPersonagem(String nome){
        return this.repositorioAnimal.recuperar(nome);
    }
    
    public void deletar(Animal animal){
        this.repositorioAnimal.remover(animal);
    }
    
    public List<Animal> recuperarTodosPersonagens(){
        return this.repositorioAnimal.recuperarTodos();
    }
    
    //APLICACOES
    public void inserir(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.cadastrar(aplicacoes);
    }
    
    public void alterar(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.alterar(aplicacoes);
    }
    
    public Aplicacoes recuperarEdicao(String descricao){
        return this.repositorioAplicacoes.recuperar(descricao);
    }
    
    public void deletar(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.remover(aplicacoes);
    }
    
    public List<Aplicacoes> recuperarTodasEdicoes(){
        return this.repositorioAplicacoes.recuperarTodos();
    }
    
}
