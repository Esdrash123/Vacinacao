package ifpe.br.edu.controladores;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.repositorios.RepositorioAplicacoesImplBD;
import ifpe.edu.br.repositorios.RepositorioGenerico;
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

public class AplicacoesController {

    private RepositorioGenerico<Aplicacoes, Integer> repositorioAplicacoes = new RepositorioAplicacoesImplBD();
    public String cadastrar(Aplicacoes aplicacoes) {
    this.repositorioAplicacoes.cadastrar(aplicacoes);
    
    FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage("A Aplicação foi cadastrado com sucesso!" ));
            return "index.xhtml";
    }

    public void alterar(Aplicacoes aplicacoes) {
        this.repositorioAplicacoes.alterar(aplicacoes);
    }

    public void remover(Aplicacoes aplicacoes) {
        this.repositorioAplicacoes.remover(aplicacoes);
    }

    public Aplicacoes recuperar(Integer id) {
       return this.repositorioAplicacoes.recuperar(id);
    }

    public List<Aplicacoes> recuperarTodos() {
        return this.repositorioAplicacoes.recuperarTodos();
    }
}
