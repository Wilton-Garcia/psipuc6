
import org.hibernate.Session;
import org.hibernate.Transaction;
import puc.si.psi.ti.util.HibernateUtil;
import puc.si.psi.ti.modelo.Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilton Garcia
 */
public class Executa {
    public static void main(String[] args) {
        
        Teste t = new Teste();
        t.setTeste("Funcionou");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transa = session.getTransaction();
        transa.begin();
        session.save(t);
        transa.commit();
        session.close();
        
    }
}
