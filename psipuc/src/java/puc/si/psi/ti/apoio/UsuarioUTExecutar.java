/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.apoio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Wilton Garcia
 */
public class UsuarioUTExecutar {

    public static void main(String[] args) {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();
        
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        
        tb_usuario_teste ut = new tb_usuario_teste();
        
        ut.setIdUT(1);
        ut.setEmailUT("Email Teste");
        ut.setSenhaUT("Senha Teste");
        
        Transaction tx = session.beginTransaction();
        session.save(ut);
        tx.commit();
    }
}
