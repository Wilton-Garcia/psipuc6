package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import puc.si.psi.ti.dao.Dao;
import puc.si.psi.ti.modelo.Doacao;
import puc.si.psi.ti.modelo.Doador;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class DoacaoMB extends Dao<Doacao>{

    private Doacao doacao = new Doacao();
    
    @ManagedProperty(value = "#{doadorSessionMB}")
    private DoadorSessionMB doadorSessionMB;

    private Doador getSessaoDoadorLogado(){
        Doador d = doadorSessionMB.getDoadorLogado();
        return d;
    }

    public DoadorSessionMB getDoadorSessionMB() {
        return doadorSessionMB;
    }

    public void setDoadorSessionMB(DoadorSessionMB doadorSessionMB) {
        this.doadorSessionMB = doadorSessionMB;
    }
    
        
    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
    
    public void salvarDoacao(){
       
       doacao.setIdDoador(getSessaoDoadorLogado().getId());
        salvar();
    }
    


    public DoacaoMB() {
        super.obj = doacao;
    }
    
}
