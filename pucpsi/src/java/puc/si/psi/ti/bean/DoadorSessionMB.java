/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.bean;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import puc.si.psi.ti.modelo.Doador;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@SessionScoped
public class DoadorSessionMB {

    private Doador doadorLogado = new Doador();

    public Doador getDoadorLogado() {
        return doadorLogado;
    }

    public void setDoadorLogado(Doador doadorLogado) {
        this.doadorLogado = doadorLogado;
    }

    public void login() throws IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Criteria criterio = session.createCriteria(Doador.class)
                    .add(Restrictions.eq("email", doadorLogado.getEmail()))
                    .add(Restrictions.eq("senha", doadorLogado.getSenha()));
            criterio.setMaxResults(1);
            doadorLogado = (Doador) criterio.uniqueResult();
            System.out.println(doadorLogado.getEmail());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (doadorLogado != null) {
                FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("home.xhtml");
            } else {
                
            }
        }

    }


public void doar(){
        
       // DoacaoMB dmb = new DoacaoMB();
        
       // dmb.doarMB(getDoadorLogado());
    }
    

}
