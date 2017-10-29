/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import puc.si.psi.ti.modelo.Instituicao;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class InstituicaoMB {

    private Instituicao instituicao = new Instituicao();
    private List<Instituicao> listaInstituicoes = new ArrayList();

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Instituicao> getListaInstituicoes() {
        return listaInstituicoes;
    }

    public void setListaInstituicoes(List<Instituicao> listaInstituicoes) {
        this.listaInstituicoes = listaInstituicoes;
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

    public void listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        this.listaInstituicoes = session.createCriteria(Instituicao.class).list();
    }

    public void consultar(Instituicao i) {
       instituicao = i;
    }

    public InstituicaoMB() {
        listar();
    }

}
