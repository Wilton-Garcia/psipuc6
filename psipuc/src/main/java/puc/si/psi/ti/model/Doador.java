/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 *
 * @author Wilton Garcia
 */
@Entity
@Table(name = "tb_doador")
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDoador;
    private String email;
    private String senha;
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    private String nomeCompleto;
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany()
    @JoinTable(name = "tb_historico_doadores", joinColumns = @JoinColumn(name = "id_doador"))
    @Cascade(CascadeType.ALL)
    private List<Doacao> historico = new ArrayList();

    public List<Doacao> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Doacao> historico) {
        this.historico = historico;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Integer getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(Integer idDoador) {
        this.idDoador = idDoador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /*
    public List<Doacao> getDoacao() {
        return doacao;
    }

    public void setDoacao(List<Doacao> doacao) {
        this.doacao = doacao;
    }
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Integer getId() {
        return idDoador;
    }

    public void setId(Integer id) {
        this.idDoador = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Doador() {
        this.endereco = new Endereco();
    }

}
