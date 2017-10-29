/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import puc.si.psi.ti.modelo.Teste;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class TesteMB {

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

    public void salvar() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transa = session.getTransaction();
            transa.begin();
            session.save(teste);
            transa.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
            this.teste = new Teste();
        }
    }

}
