package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import puc.si.psi.ti.dao.DaoMensagem;
import puc.si.psi.ti.modelo.Doador;
import puc.si.psi.ti.modelo.Instituicao;
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

    @ManagedProperty(value = "#{instituicaoSessionMB}")
    private InstituicaoSessionMB instituicaoSessionMB;

    private Doador getSessaoDoadorLogado() {
        Doador d = doadorSessionMB.getDoadorLogado();
        return d;
    }

    private Instituicao getSessaoInstituicaoLogado() {
        Instituicao i = instituicaoSessionMB.getInstituicaoLogada();
        return i;
    }

    public DoadorSessionMB getDoadorSessionMB() {
        return doadorSessionMB;
    }

    public void setDoadorSessionMB(DoadorSessionMB doadorSessionMB) {
        this.doadorSessionMB = doadorSessionMB;
    }

    public InstituicaoSessionMB getInstituicaoSessionMB() {
        return instituicaoSessionMB;
    }

    public void setInstituicaoSessionMB(InstituicaoSessionMB instituicaoSessionMB) {
        this.instituicaoSessionMB = instituicaoSessionMB;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void enviarMensagem() {

        if (instituicaoSessionMB.getInstituicaoLogada().getId() == null && doadorSessionMB.getDoadorLogado().getId() != null) {

            mensagem.setRemetente(getSessaoDoadorLogado().getEmail());
            salvar();
        } else if (doadorSessionMB.getDoadorLogado().getId() == null && instituicaoSessionMB.getInstituicaoLogada().getId() != null) {
            mensagem.setRemetente(getSessaoInstituicaoLogado().getEmail());
            salvar();
        }

        this.mensagem = new Mensagem();

    }

    public void atualizarCaixaDeEntrada() {
        if (instituicaoSessionMB.getInstituicaoLogada().getId() == null && doadorSessionMB.getDoadorLogado().getId() != null) {
            caixaDeEntrada = carregarCaixaDeEntrada(getSessaoDoadorLogado().getEmail());
        } else if (doadorSessionMB.getDoadorLogado().getId() == null && instituicaoSessionMB.getInstituicaoLogada().getId() != null) {
            caixaDeEntrada = carregarCaixaDeEntrada(getSessaoInstituicaoLogado().getEmail());
        }
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
