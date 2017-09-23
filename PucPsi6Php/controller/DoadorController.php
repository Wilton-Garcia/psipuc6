<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class DoadorController{
    private $doador;
    
    
    
    public function cadastrarDoador(){
        
        $doador = new Doador;
        $doador->setEmailDoador($_POST['emailDoador']);
    }
    
    
    
    
}