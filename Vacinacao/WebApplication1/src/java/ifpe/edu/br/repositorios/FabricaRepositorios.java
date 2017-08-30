/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;
import ifpe.edu.br.repositorios.RepositorioGenerico;

/**
 *
 * @author MEU
 */
public class FabricaRepositorios {
    
    public static final int ANIMAL = 1;
    public static final int APLICACOES = 2;
    public static final int DOENCA = 3;
    public static final int RACA = 4;
    public static final int VACINA = 5;
    public static final int VETERINARIO = 6;
    
    public static final int MEMORIA = 1;
    public static final int BANCODADOS = 2;
    public static final int ARQUIVO =3;
    
    public static RepositorioGenerico manufactor(int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia==MEMORIA){
            if(tipoNegocio==VETERINARIO){
                return new RepositorioVeterinario();
            }
            if(tipoNegocio==VACINA){
                return null;
            }
        }
        if(tipoNegocio==BANCODADOS){
            if(tipoNegocio==VETERINARIO){
                return null;
            }
        }
        return null;
    }
}


    

