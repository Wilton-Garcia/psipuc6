package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import puc.si.psi.ti.dao.DaoDoacao;
import puc.si.psi.ti.modelo.Doacao;
import puc.si.psi.ti.modelo.Doador;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class DoacaoMB extends DaoDoacao <Doacao>{

    private Doacao doacao = new Doacao();
    
    private List<Doacao> historicoDoado = new ArrayList();
    
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
        this.doacao = new  Doacao();
    }
    
    public void carregarHistoricoDoador(){
        this.historicoDoado = carregarMeuHistorico(getSessaoDoadorLogado().getId());
    }

    public List<Doacao> getHistoricoDoado() {
        return historicoDoado;
    }

    public void setHistoricoDoado(List<Doacao> historicoDoado) {
        this.historicoDoado = historicoDoado;
    }
    
    

    public DoacaoMB() {
        super.obj = doacao;
        
    }
    
}
