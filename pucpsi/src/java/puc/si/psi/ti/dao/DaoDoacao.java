/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import puc.si.psi.ti.util.HibernateUtil;

/**
 *
 * @author Wilton Garcia
 */
public abstract class DaoDoacao<T> {

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
    public List<T> carregarMeuHistorico(long id){
        session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(obj.getClass())
                .add(Restrictions.eq("id", id))
                .list();
    }
    
    
}
