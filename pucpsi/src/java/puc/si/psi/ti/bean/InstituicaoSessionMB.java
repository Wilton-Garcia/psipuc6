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
import puc.si.psi.ti.modelo.Instituicao;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
@SessionScoped
public class InstituicaoSessionMB {

    private Instituicao instituicaoLogada = new Instituicao();

    public Instituicao getInstituicaoLogada() {
        return instituicaoLogada;
    }

    public void setInstituicaoLogada(Instituicao instituicaoLogada) {
        this.instituicaoLogada = instituicaoLogada;
    }

   public void login() throws IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Criteria criterio = session.createCriteria(Instituicao.class)
                    .add(Restrictions.eq("email", instituicaoLogada.getEmail()))
                    .add(Restrictions.eq("senha", instituicaoLogada.getSenha()));
            criterio.setMaxResults(1);
            instituicaoLogada = (Instituicao) criterio.uniqueResult();
            System.out.println(instituicaoLogada.getEmail());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (instituicaoLogada != null) {
                FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .redirect("homei.xhtml");
            } else {
                
            }
        }
        
   }
   

}
