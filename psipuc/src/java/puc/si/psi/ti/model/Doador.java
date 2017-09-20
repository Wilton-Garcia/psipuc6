/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Wilton Garcia
 */
@Entity
public class Doador {
    @Id
    @GeneratedValue
    private int idDoador;
    private String emailDoador;
    private String cpfDodaor;
    private String senhaDoador;
    private List<Doacao> historicoDoador;

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }

    public String getCpfDodaor() {
        return cpfDodaor;
    }

    public void setCpfDodaor(String cpfDodaor) {
        this.cpfDodaor = cpfDodaor;
    }

    public String getSenhaDoador() {
        return senhaDoador;
    }

    public void setSenhaDoador(String senhaDoador) {
        this.senhaDoador = senhaDoador;
    }

    public List<Doacao> getHistoricoDoador() {
        return historicoDoador;
    }

    public void setHistoricoDoador(List<Doacao> historicoDoador) {
        this.historicoDoador = historicoDoador;
    }
    
    
    
}
