/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puc.si.psi.ti.testes;

import java.time.Instant;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import puc.si.psi.ti.model.Doacao;
import puc.si.psi.ti.model.Doador;

/**
 *
 * @author Wilton Garcia
 */
public class UsuarioTeste {

    public static void main(String[] args) {

        Doador doador = new Doador();

        doador.setEmail("wilton@testes.com");
        doador.setSenha("123456");
        doador.setNomeCompleto("Wilton Testes");
        
        doador.getEndereco().setBairro("Jaqueline");
        doador.getEndereco().setCidade("Belo Horizonte");
        doador.getEndereco().setEstado("MG");
        doador.getEndereco().setComplemento("--");
        doador.getEndereco().setLogradouro("Ozenil José de Oliveira 97");
        doador.getEndereco().setNumero(97);

        Doacao doacao = new Doacao();
        doacao.setEndereco("Teste Enderço");
        doacao.setItem("Teste Item");
        doacao.setIdDoador(doador.getId());
        doador.getHistorico().add(doacao);
        
        doacao = new Doacao();
        doacao.setEndereco("Teste Enderço 2");
        doacao.setItem("Teste Item 2");
        doacao.setId(doador.getId());

        doador.getHistorico().add(doacao);
        
        //Instancia a fabrica de conexões
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //Abre a conexão com o banco de dados
        Session session = factory.openSession();
        //Começa o processo de transação
        session.beginTransaction();
        //Salva o estado do objeto atual
        session.save(doador);
        //Faz o commit dos dados para o banco
        session.getTransaction().commit();
        //Fecha a conexão com o banco de dados
        session.close();
        

    }

}
