/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import puc.si.psi.ti.model.Mensagem;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@RequestScoped
public class MensagemBEAN {

    public Mensagem mensagem;

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    public void apagarMensagem(int id_mensagem){
     //colocar o hibernate aqui   
    }
    
    /**
     * Creates a new instance of MensagemBEAN
     */
    public MensagemBEAN() {
    }
    
}
