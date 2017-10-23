/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import puc.si.psi.ti.controller.OperacoesHibernate;
import puc.si.psi.ti.model.Doacao;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@RequestScoped
public class DoacaoBean {

    private final OperacoesHibernate hibernate = new OperacoesHibernate();
    private Doacao doacao = new Doacao();
    private List<Doacao> pedidosDoacaoes = new ArrayList();
    
    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    public void cadastrarDoacao() {
        hibernate.cadastrarDoacao(this.doacao);
        this.doacao = new Doacao();
    }

    public List<Doacao> getPedidosDoacaoes() {
        return pedidosDoacaoes;
    }

    public void setPedidosDoacaoes(List<Doacao> pedidosDoacaoes) {
        this.pedidosDoacaoes = pedidosDoacaoes;
    }

    public void recuperaListaPedidoDoacoes(){
        this.pedidosDoacaoes = hibernate.retornaPedidoDoacoes();
    }
    
    
    public DoacaoBean() {
    }

}
