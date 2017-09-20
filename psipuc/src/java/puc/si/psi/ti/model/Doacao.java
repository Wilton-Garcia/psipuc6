/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Wilton Garcia
 */
@Entity
public class Doacao {
    @Id
    @GeneratedValue
    private int idDoacao;
    private String cpfDodaor;
    private String cnpjDoador;
    private Date dataDisponibilidade;
    
    private String itemDoado;
    private String descricaoDoador;

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public String getCpfDodaor() {
        return cpfDodaor;
    }

    public void setCpfDodaor(String cpfDodaor) {
        this.cpfDodaor = cpfDodaor;
    }

    public String getCnpjDoador() {
        return cnpjDoador;
    }

    public void setCnpjDoador(String cnpjDoador) {
        this.cnpjDoador = cnpjDoador;
    }

    public Date getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(Date dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }

    public String getItemDoado() {
        return itemDoado;
    }

    public void setItemDoado(String itemDoado) {
        this.itemDoado = itemDoado;
    }

    public String getDescricaoDoador() {
        return descricaoDoador;
    }

    public void setDescricaoDoador(String descricaoDoador) {
        this.descricaoDoador = descricaoDoador;
    }
    
}
