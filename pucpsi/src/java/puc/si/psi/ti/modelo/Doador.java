package puc.si.psi.ti.modelo;

import java.io.Serializable;
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
@Table(name = "TB_DOADOR")
public class Doador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String email;
    private String senha;
    private String nomeCompleto;
    private String cpf;
    
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany
    @JoinTable(name = "tb_historico_doadores", joinColumns = @JoinColumn(name = "id_doador"))
    private List<Doacao> historicoDoador = new ArrayList();
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public List<Doacao> getHistoricoDoador() {
        return historicoDoador;
    }

    public void setHistoricoDoador(List<Doacao> historicoDoador) {
        this.historicoDoador = historicoDoador;
    }

    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doador)) {
            return false;
        }
        Doador other = (Doador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "puc.si.psi.ti.modelo.Doador[ id=" + id + " ]";
    }

    public Doador() {
        this.endereco = new Endereco();
    }
    
    
}
