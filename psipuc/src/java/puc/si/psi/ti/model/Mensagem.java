/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

/**
 *
 * @author Wilton Garcia
 */
public class Mensagem {
    
    private int idMensagem;
    private String cpfDoador;
    private String cnpjInstuicao;
    private String texto;

    public int getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getCpfDoador() {
        return cpfDoador;
    }

    public void setCpfDoador(String cpfDoador) {
        this.cpfDoador = cpfDoador;
    }

    public String getCnpjInstuicao() {
        return cnpjInstuicao;
    }

    public void setCnpjInstuicao(String cnpjInstuicao) {
        this.cnpjInstuicao = cnpjInstuicao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
}
