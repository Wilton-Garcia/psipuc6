<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Doador
 *
 * @author Wilton Garcia
 */
class Doador {
    private $idDoador;
    private $emailDoador;
    private $senhaDoador;
    
    private $nomeDoador;
    private $icpfDoador;
    private $historicoDoador = [];
    
    function getIdDoador() {
        return $this->idDoador;
    }

    function getEmailDoador() {
        return $this->emailDoador;
    }

    function getSenhaDoador() {
        return $this->senhaDoador;
    }

    function getNomeDoador() {
        return $this->nomeDoador;
    }

    function getIcpfDoador() {
        return $this->icpfDoador;
    }

    function getHistoricoDoador() {
        return $this->historicoDoador;
    }

    function setIdDoador($idDoador) {
        $this->idDoador = $idDoador;
    }

    function setEmailDoador($emailDoador) {
        $this->emailDoador = $emailDoador;
    }

    function setSenhaDoador($senhaDoador) {
        $this->senhaDoador = $senhaDoador;
    }

    function setNomeDoador($nomeDoador) {
        $this->nomeDoador = $nomeDoador;
    }

    function setIcpfDoador($icpfDoador) {
        $this->icpfDoador = $icpfDoador;
    }

    function setHistoricoDoador($historicoDoador) {
        $this->historicoDoador = $historicoDoador;
    }



}
