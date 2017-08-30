package ifpe.edu.br.fachada;

import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.entidades.Veterinario;

import ifpe.edu.br.repositorios.FabricaRepositorios;
import ifpe.edu.br.repositorios.RepositorioGenerico;
import ifpe.edu.br.repositorios.RepositorioAnimal;
import ifpe.edu.br.repositorios.RepositorioAplicacoes;
import ifpe.edu.br.repositorios.RepositorioDoenca;
import ifpe.edu.br.repositorios.RepositorioRaca;
import ifpe.edu.br.repositorios.RepositorioVacina;
import ifpe.edu.br.repositorios.RepositorioVeterinario;
import java.util.*;


public class Fachada {

    private static Fachada myself = null;

    private RepositorioGenerico<Animal, String> repositorioAnimal = null;
    private RepositorioGenerico<Aplicacoes, String> repositorioAplicacoes = null;
    private RepositorioGenerico<Doenca, String> repositorioDoenca = null;
    private RepositorioGenerico<Raca, String> repositorioRaca = null;
    private RepositorioGenerico<Vacina, String> repositorioVacina = null;
    private RepositorioGenerico<Veterinario, String> repositorioVeterinario = null;

    private Fachada() {
        this.repositorioAnimal = FabricaRepositorios.manufactor(FabricaRepositorios.ANIMAL,
                FabricaRepositorios.MEMORIA);
        this.repositorioAplicacoes = FabricaRepositorios.manufactor(FabricaRepositorios.APLICACOES,
                FabricaRepositorios.MEMORIA);
        this.repositorioDoenca = FabricaRepositorios.manufactor(FabricaRepositorios.DOENCA,
                FabricaRepositorios.MEMORIA);
        this.repositorioRaca = FabricaRepositorios.manufactor(FabricaRepositorios.RACA,
                FabricaRepositorios.MEMORIA);
        this.repositorioVacina = FabricaRepositorios.manufactor(FabricaRepositorios.VACINA,
                FabricaRepositorios.MEMORIA);
        this.repositorioVeterinario = FabricaRepositorios.manufactor(FabricaRepositorios.VETERINARIO,
                FabricaRepositorios.MEMORIA);
    }
     public static Fachada getInstance(){
        if(myself == null){
            myself = new Fachada();
        }
        return myself;
    }
  
    public void inserir(Animal animal) {
        this.repositorioAnimal.cadastrar(animal);
    }
    public void inserir(Aplicacoes aplicacoes) {
        this.repositorioAplicacoes.cadastrar(aplicacoes);
    }
    public void inserir(Doenca doenca) {
        this.repositorioDoenca.cadastrar(doenca);
    }
    public void inserir(Vacina vacina) {
        this.repositorioVacina.cadastrar(vacina);
    }
    public void inserir(Veterinario veterinario) {
        this.repositorioVeterinario.cadastrar(veterinario);
    }
    public void inserir(Raca raca) {
        this.repositorioRaca.cadastrar(raca);
    }

    
    
    public void alterar(Aplicacoes aplicacoes) {
        this.repositorioAplicacoes.alterar(aplicacoes);
    }
    public void alterar(Doenca doenca) {
        this.repositorioDoenca.alterar(doenca);
    }
    public void alterar(Raca raca) {
        this.repositorioRaca.alterar(raca);
    }
    public void alterar(Vacina vacina) {
        this.repositorioVacina.alterar(vacina);
    }
    public void alterar(Veterinario veterinario) {
        this.repositorioVeterinario.alterar(veterinario);
    }
    public void alterar(Animal animal) {
        this.repositorioAnimal.alterar(animal);
    }

    
    
    public Animal recuperarAminais(String nome) {
        return this.repositorioAnimal.recuperar(nome);
    }
    public Aplicacoes recuperarAplicacoes(String nome) {
        return this.repositorioAplicacoes.recuperar(nome);
    }
    public Doenca recuperarDoenca(String nome) {
        return this.repositorioDoenca.recuperar(nome);
    }
    public Vacina recuperarVacina(String nome) {
        return this.repositorioVacina.recuperar(nome);
    }
    public Veterinario recuperarVeterinario(String nome) {
        return this.repositorioVeterinario.recuperar(nome);
    }
    public Raca recuperarRaca(String nome) {
        return this.repositorioRaca.recuperar(nome);
    }

    
    
    public void deletar(Animal animal) {
        this.repositorioAnimal.remover(animal);
    }
    public void deletar(Aplicacoes aplicacoes) {
        this.repositorioAplicacoes.remover(aplicacoes);
    }
    public void deletar(Doenca doenca) {
        this.repositorioDoenca.remover(doenca);
    }
    public void deletar(Raca raca) {
        this.repositorioRaca.remover(raca);
    }
    public void deletar(Vacina vacina) {
        this.repositorioVacina.remover(vacina);
    }
    public void deletar(Veterinario veterinario) {
        this.repositorioVeterinario.remover(veterinario);
    }



    public List<Animal> recuperarTodosAnimais() {
        return this.repositorioAnimal.recuperarTodos();
    }
    public List<Aplicacoes> recuperarTodasAplicacoes() {
        return this.repositorioAplicacoes.recuperarTodos();
    }
    public List<Doenca> recuperarTodasDoencas() {
        return this.repositorioDoenca.recuperarTodos();
    }
    public List<Raca> recuperarTodasRacas() {
        return this.repositorioRaca.recuperarTodos();
    }
    public List<Vacina> recuperarTodasVacinas() {
        return this.repositorioVacina.recuperarTodos();
    }
    public List<Veterinario> recuperarTodosVeterinarios() {
        return this.repositorioVeterinario.recuperarTodos();
    }
}
