/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.testes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wilton Garcia
 */
@Entity
@Table(name = "tb_teste_persistencia")
public class TestesPersistencia {
    @Id
    @GeneratedValue
    private Integer idTeste;
    private Integer randomValueTeste;

    public Integer getIdTeste() {
        return idTeste;
    }

    public void setIdTeste(Integer idTeste) {
        this.idTeste = idTeste;
    }

    public Integer getRandomValueTeste() {
        return randomValueTeste;
    }

    public void setRandomValueTeste(Integer randomValueTeste) {
        this.randomValueTeste = randomValueTeste;
    }
    
    
    
}
