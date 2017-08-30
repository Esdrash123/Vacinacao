/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

/**
 *
 * @author 20141D12GR0505
 */
public class FabricaRepositorio {
    
    public static final int ANIMAL = 1;
    public static final int APLICACOES = 2;
    public static final int DOENCA = 3;
    public static final int RACA = 4;
    public static final int VACINA = 5;
    public static final int VETERINARIO = 6;
    
    public static final int MEMORIA = 1;
    
    public static RepositorioGenerico manufactor(int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia == MEMORIA){
            if(tipoNegocio == ANIMAL){
                return new RepositorioAnimal();
            }
            if(tipoNegocio == APLICACOES){
                return new RepositorioAplicacoes();
            }
            if(tipoNegocio == DOENCA){
                return new RepositorioDoenca();
            }
            if(tipoNegocio == RACA){
                return new RepositorioRaca();
            }
            if(tipoNegocio == VACINA){
                return new RepositorioVacina();
            }
            if(tipoNegocio == VETERINARIO){
                return new RepositorioVeterinario();
            }
        }
        return null;
    }
    
}
