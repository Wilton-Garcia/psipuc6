/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.psi.ti.model;

import puc.psi.ti.model.Doacao;

import java.util.List;


/**
 *
 * @author Wilton Garcia
 */
public class Doador {
    private String nomeDoador;
    private String emailDoador;
    protected String senhaDoador;
    private int avaliacaoDoador;
    private List<Doacao> historico;

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }
    public String getSenhaDoador() {
        return senhaDoador;
    }
    public void setSenhaDoador(String senhaDoador) {
        this.senhaDoador = senhaDoador;
    }
    public int getAvaliacaoDoador() {
        return avaliacaoDoador;
    }
    public void setAvaliacaoDoador(int avaliacaoDoador) {
        this.avaliacaoDoador = avaliacaoDoador;
    }
    public List<Doacao> getHistorico() {
        return historico;
    }
    public void setHistorico(List<Doacao> historico) {
        this.historico = historico;
    }
}
