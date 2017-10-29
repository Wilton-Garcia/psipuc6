/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import puc.si.psi.ti.modelo.Doador;
import puc.si.psi.ti.modelo.Instituicao;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class InstituicaoMB {

    private Instituicao instituicao = new Instituicao();

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public void salvar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transa = session.getTransaction();
            transa.begin();
            session.save(instituicao);
            transa.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            session.close();
            this.instituicao = new Instituicao();
        }
    }

}
