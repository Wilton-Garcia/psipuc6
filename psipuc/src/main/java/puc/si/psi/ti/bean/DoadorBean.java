 package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import puc.si.psi.ti.controller.OperacoesHibernate;

import puc.si.psi.ti.model.Doador;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@RequestScoped
public class DoadorBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    private Doador doador = new Doador();
    private OperacoesHibernate hibernate = new OperacoesHibernate();
    
    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }
    
    public void cadastrar(){
        hibernate.cadastrarDoador(doador);
        this.doador = new Doador();
    }
    
    public DoadorBean() {
    }
}
