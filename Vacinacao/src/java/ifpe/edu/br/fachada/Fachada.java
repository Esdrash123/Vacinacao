/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.fachada;

import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.entidades.Aplicacoes;
<<<<<<< HEAD
=======
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.entidades.Veterinario;
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
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
<<<<<<< HEAD
    private RepositorioGenerico<Aplicacoes,String> repositorioDoenca = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioRaca = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioVacina = null;
    private RepositorioGenerico<Aplicacoes,String> repositorioVeterinario = null;
=======
    private RepositorioGenerico<Doenca,String> repositorioDoenca = null;
    private RepositorioGenerico<Raca,String> repositorioRaca = null;
    private RepositorioGenerico<Vacina,String> repositorioVacina = null;
    private RepositorioGenerico<Veterinario,String> repositorioVeterinario = null;
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
    
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
    
<<<<<<< HEAD
    public Animal recuperarPersonagem(String nome){
=======
    public Animal recuperarAminais(String nome){
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
        return this.repositorioAnimal.recuperar(nome);
    }
    
    public void deletar(Animal animal){
        this.repositorioAnimal.remover(animal);
    }
    
<<<<<<< HEAD
    public List<Animal> recuperarTodosPersonagens(){
=======
    public List<Animal> recuperarTodosAnimais(){
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
        return this.repositorioAnimal.recuperarTodos();
    }
    
    //APLICACOES
    public void inserir(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.cadastrar(aplicacoes);
    }
    
    public void alterar(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.alterar(aplicacoes);
    }
    
<<<<<<< HEAD
    public Aplicacoes recuperarEdicao(String descricao){
=======
    public Aplicacoes recuperarAplicacoes(String descricao){
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
        return this.repositorioAplicacoes.recuperar(descricao);
    }
    
    public void deletar(Aplicacoes aplicacoes){
        this.repositorioAplicacoes.remover(aplicacoes);
    }
    
<<<<<<< HEAD
    public List<Aplicacoes> recuperarTodasEdicoes(){
        return this.repositorioAplicacoes.recuperarTodos();
    }
    
=======
    public List<Aplicacoes> recuperarTodasAplicacoes(){
        return this.repositorioAplicacoes.recuperarTodos();
    }
    
    //DOENCA
    public void inserir(Doenca doenca){
        this.repositorioDoenca.cadastrar(doenca);
    }
    public void alterar(Doenca doenca){
        this.repositorioDoenca.alterar(doenca);
    }
    public Doenca recuperarDoenca(String nome){
        return this.repositorioDoenca.recuperar(nome);
    }
    public void deletar(Doenca doenca){
        this.repositorioDoenca.remover(doenca);
    }
    public List<Doenca> recuperarTodasDoencas(){
        return this.repositorioDoenca.recuperarTodos();
    }
    
    //RACA
    public void inserir(Raca raca){
        this.repositorioRaca.cadastrar(raca);
    }
    public void alterar(Raca raca){
        this.repositorioRaca.alterar(raca);
    }
    public Raca recuperarRaca(String nome){
        return this.repositorioRaca.recuperar(nome);
    }
    public void deletar(Raca raca){
        this.repositorioRaca.remover(raca);
    }
    public List<Raca> recuperarTodasRacas(){
        return this.repositorioRaca.recuperarTodos();
    }
    
    //VACINA
    public void inserir(Vacina vacina){
        this.repositorioVacina.cadastrar(vacina);
    }
    public void alterar(Vacina vacina){
        this.repositorioVacina.alterar(vacina);
    }
    public Vacina recuperarVacina(String nome){
        return this.repositorioVacina.recuperar(nome);
    }
    public void deletar(Vacina vacina){
        this.repositorioVacina.remover(vacina);
    }
    public List<Vacina> recuperarTodasVacinas(){
        return this.repositorioVacina.recuperarTodos();
    }
    
    //VETERINARIO
    public void inserir (Veterinario veterinario){
        this.repositorioVeterinario.cadastrar(veterinario);
    }
    public void alterar(Veterinario veterinario){
        this.repositorioVeterinario.alterar(veterinario);
    }
    public Veterinario recuperarVeterinario(String nome){
        return this.repositorioVeterinario.recuperar(nome);
    }
    public void deletar(Veterinario veterinario){
        this.repositorioVeterinario.remover(veterinario);
    }
    public List<Veterinario> recuperarTodosVeterinarios(){
        return this.repositorioVeterinario.recuperarTodos();
    }
    
>>>>>>> 63e47711ec64bde6de9e1ba6d06fa7297e2dbe29
}
