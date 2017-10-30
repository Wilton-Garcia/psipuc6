/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.dao;

import javax.faces.view.facelets.FaceletContext;
import org.hibernate.Session;
import org.hibernate.Transaction;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
public abstract class Dao<T> {

    private Session session;
    private Transaction transaction;

    protected T obj;

    public boolean salvar() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(obj);
            transaction.commit();

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            session.close();
        }

    }
     public boolean atualizar() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        try {
            session.update(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {

            return false;
        } finally {
            session.close();
        }
    }
}
