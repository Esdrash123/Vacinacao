/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.repositorios;

import java.util.List;

/**
 *
 * @author esdra
 */
public interface RepositorioGenerico<T, G> {

    public void cadastrar(T t);

    public void remover(T t);

    public void alterar(T t);

    public T recuperar(G codigo);

    public List<T> recuperarTodos();

}
