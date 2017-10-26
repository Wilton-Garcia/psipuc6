/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.testes;

import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Wilton Garcia
 */
public class ExecutaTestePersistencia {
    public static void main(String[] args){
        Random gerador = new Random();
        
        TestesPersistencia tp = new TestesPersistencia();
        tp.setRandomValueTeste(gerador.nextInt());
        //Instancia a fabrica de conexões
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //Abre a conexão com o banco de dados
        Session session = factory.openSession();
        //Começa o processo de transação
        session.beginTransaction();
        //Salva o estado do objeto atual
        session.save(tp);
        //Faz o commit dos dados para o banco
        session.getTransaction().commit();
        //Fecha a conexão com o banco de dados
    }
}
