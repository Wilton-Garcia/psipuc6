/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

import java.util.List;

/**
 *
 * @author Wilton Garcia
 */
public class Instituicao {
    private int avalicaoInstituicao;
    private String nomeInstituicao;
    private String razaoSocial;
    private String enderecoInstituicao;
    private String emailInstituicao;
    private String cnpjInstituicao;
    protected String senhaInstituicao;
    private List<Doacao> historioInstituicao;

    public int getAvalicaoInstituicao() {
        return avalicaoInstituicao;
    }

    public void setAvalicaoInstituicao(int avalicaoInstituicao) {
        this.avalicaoInstituicao = avalicaoInstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEnderecoInstituicao() {
        return enderecoInstituicao;
    }

    public void setEnderecoInstituicao(String enderecoInstituicao) {
        this.enderecoInstituicao = enderecoInstituicao;
    }

    public String getEmailInstituicao() {
        return emailInstituicao;
    }

    public void setEmailInstituicao(String emailInstituicao) {
        this.emailInstituicao = emailInstituicao;
    }

    public String getCnpjInstituicao() {
        return cnpjInstituicao;
    }

    public void setCnpjInstituicao(String cnpjInstituicao) {
        this.cnpjInstituicao = cnpjInstituicao;
    }

    public String getSenhaInstituicao() {
        return senhaInstituicao;
    }

    public void setSenhaInstituicao(String senhaInstituicao) {
        this.senhaInstituicao = senhaInstituicao;
    }

    public List<Doacao> getHistorioInstituicao() {
        return historioInstituicao;
    }

    public void setHistorioInstituicao(List<Doacao> historioInstituicao) {
        this.historioInstituicao = historioInstituicao;
    }   
}