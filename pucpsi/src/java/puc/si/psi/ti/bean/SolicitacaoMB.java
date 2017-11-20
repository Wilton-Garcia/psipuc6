/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import puc.si.psi.ti.dao.DaoInstituicao;
import puc.si.psi.ti.modelo.Instituicao;
import puc.si.psi.ti.modelo.Solicitacao;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class SolicitacaoMB extends DaoInstituicao<Solicitacao> {

    private Solicitacao solicitacao = new Solicitacao();

   
    @ManagedProperty(value = "#{instituicaoSessionMB}")
    private InstituicaoSessionMB instituicaoSessionMB;

    private List<Solicitacao> historicoDePedidos = new ArrayList();
    
    public Instituicao getSessaoInstituicaoLogado() {
        Instituicao i = instituicaoSessionMB.getInstituicaoLogada();
        return i;
    }

    public List<Solicitacao> getHistoricoDePedidos() {
        return historicoDePedidos;
    }

    public void setHistoricoDePedidos(List<Solicitacao> historicoDePedidos) {
        this.historicoDePedidos = historicoDePedidos;
    }

    
    
     public InstituicaoSessionMB getInstituicaoSessionMB() {
        return instituicaoSessionMB;
    }
     
     public void setInstituicaoSessionMB(InstituicaoSessionMB instituicaoSessionMB) {
        this.instituicaoSessionMB = instituicaoSessionMB;
    } 
     
    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
 
    
    public void salvarPedido() {
        solicitacao.setIdInstituicao(getSessaoInstituicaoLogado().getId());
        salvar();
        this.solicitacao = new Solicitacao();
    }
    
    public void carregarHistoricoPedidos(){
        this.historicoDePedidos = carregarMeuHistorico(getSessaoInstituicaoLogado().getId());
    }

    public SolicitacaoMB() {
        super.obj = solicitacao;
    }
}
