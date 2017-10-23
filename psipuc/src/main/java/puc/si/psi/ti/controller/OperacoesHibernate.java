/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import puc.si.psi.ti.model.Doacao;
import puc.si.psi.ti.model.Doador;
import puc.si.psi.ti.model.Instituicao;

/**
 *
 * @author Wilton Garcia
 */
public class OperacoesHibernate {
    
    
    
     public  void cadastrarDoador(Doador doador){
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         session.beginTransaction();
         session.save(doador);
         session.getTransaction().commit();
         session.close();
     }
      public  void cadastrarDoacao(Doacao doacao){
          
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         session.beginTransaction();
         session.save(doacao);
         session.getTransaction().commit();
         session.close();
     }
      public void cadastraInstituicao(Instituicao instituicao){
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         session.beginTransaction();
         session.save(instituicao);
         session.getTransaction().commit();
         session.close(); 
      }
    
      public List<Doacao> retornaPedidoDoacoes(){
        List<Doacao> doacoes = new ArrayList<Doacao>();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        doacoes = session.createCriteria(Doacao.class).list();
        return doacoes; 
      }
}
