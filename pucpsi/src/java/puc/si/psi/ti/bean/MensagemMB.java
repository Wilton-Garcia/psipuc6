package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import puc.si.psi.ti.dao.DaoMensagem;
import puc.si.psi.ti.modelo.Doador;
import puc.si.psi.ti.modelo.Mensagem;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class MensagemMB extends DaoMensagem<Mensagem> {
    
    private Mensagem mensagem = new Mensagem();
    private List<Mensagem> caixaDeEntrada = new ArrayList();
    
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
    
    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    public void enviarMensagem(){
        mensagem.setRemetente(getSessaoDoadorLogado().getEmail());
        if(mensagem.getDestinatario() != null && mensagem.getRemetente() != null){
            salvar();
        }
    }
    
    public void atualizarCaixaDeEntrada(){
        System.out.println(getSessaoDoadorLogado().getEmail());
        caixaDeEntrada = carregarCaixaDeEntrada(getSessaoDoadorLogado().getEmail());
        System.out.println("!");
    }
    
    public MensagemMB() {
        super.obj = mensagem;
    }

    public List<Mensagem> getCaixaDeEntrada() {
        return caixaDeEntrada;
    }

    public void setCaixaDeEntrada(List<Mensagem> caixaDeEntrada) {
        this.caixaDeEntrada = caixaDeEntrada;
    }
    
     public void consultar(Mensagem i) {
       mensagem = i;
    }
    
}
