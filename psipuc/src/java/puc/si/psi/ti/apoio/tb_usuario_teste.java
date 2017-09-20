/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.apoio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Wilton Garcia
 */
@Entity
public class tb_usuario_teste {

    @Id
    private int idUT;

    private String emailUT;

    private String senhaUT;

    public int getIdUT() {
        return idUT;
    }

    public void setIdUT(int idUT) {
        this.idUT = idUT;
    }

    public String getEmailUT() {
        return emailUT;
    }

    public void setEmailUT(String emailUT) {
        this.emailUT = emailUT;
    }

    public String getSenhaUT() {
        return senhaUT;
    }

    public void setSenhaUT(String senhaUT) {
        this.senhaUT = senhaUT;
    }
}
