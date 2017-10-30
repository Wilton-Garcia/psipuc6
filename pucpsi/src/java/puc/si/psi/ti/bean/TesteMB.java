/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import puc.si.psi.ti.dao.Dao;
import puc.si.psi.ti.modelo.Teste;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@SessionScoped
public class TesteMB extends Dao<Teste>{

    private Teste teste = new Teste();

    public Teste getTeste() {
        return teste;
    }

    public void setTeste(Teste teste) {
        this.teste = teste;
    }

    public void mostraNoConsole() {
        System.out.println(teste.getTeste());
    }

    public void salvarTeste(){
        salvar();
    };

    public TesteMB() {
        super.obj = teste;
    }
    
    

}
