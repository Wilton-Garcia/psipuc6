/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import puc.si.psi.ti.dao.Dao;
import puc.si.psi.ti.modelo.Solicitacao;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class SolicitacaoMB extends Dao <Solicitacao>{
    private Solicitacao solicitacao;

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
    
    
    
}
