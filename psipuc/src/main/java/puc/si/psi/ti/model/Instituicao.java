/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Wilton Garcia
 */
@Entity
@Table(name = "tb_instituicao")
public class Instituicao {
    
    @Id
    @GeneratedValue
    private Integer idInstituicao;
    @NotNull
    private String cnpj;
    private String razaoSocial;
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Endereco endereco;
    private String emailInstituicao;
    private String senha;

    public Integer getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(Integer idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmailInstituicao() {
        return emailInstituicao;
    }

    public void setEmailInstituicao(String emailInstituicao) {
        this.emailInstituicao = emailInstituicao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
}
