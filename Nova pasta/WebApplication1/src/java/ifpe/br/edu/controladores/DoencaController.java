package ifpe.br.edu.controladores;

import ifpe.edu.br.dao.PersistenceDao;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.repositorios.RepositorioDoencaImplBD;
import ifpe.edu.br.repositorios.RepositorioGenerico;
import ifpe.edu.br.repositorios.RepositorioDoenca;
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

public class DoencaController {

    private RepositorioGenerico<Doenca, Integer> repositorioDoenca = new RepositorioDoencaImplBD();

    public String cadastrar(Doenca doenca) {
        this.repositorioDoenca.cadastrar(doenca);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("A Doença " + doenca.getNome() + " foi cadastrada com sucesso!"));
        return "index.xhtml";
    }

    public void alterar(Doenca doenca) {
        this.repositorioDoenca.alterar(doenca);
    }

    public void remover(Doenca doenca) {
        this.repositorioDoenca.remover(doenca);
    }

    public Doenca recuperar(Integer id) {
        return this.repositorioDoenca.recuperar(id);
    }

    public List<Doenca> recuperarTodos() {
        return this.repositorioDoenca.recuperarTodos();
    }

}
