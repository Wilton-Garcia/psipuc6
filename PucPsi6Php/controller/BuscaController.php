<?php
session_start();

$_SG['conectaServidor']=TRUE;;//abre conexão com o mysql
$_SG['abreSessao']=FALSE;//Inicia a sessão 
$_SG['caseSensitive']=FALSE;// usa case sensitive
$_SG['validaSempre']=TRUE;// valida a cada login

$_SG['paginaincial']="paginaInicial.php";
$_SG['tabela']="usuarios";

//verifica se é necessario iniciar a sessão 
if($_SG['abreSessao']==TRUE){
    session_start ();
}
//função de validação de usuario e senha
function validaUser($usuario){
    global $_SG;
    $cS = ($_SG['caseSensitive']) ? 'BINARY' : '';
    //usa a função addslashes para escapara as aspas
    $nusuario= addslashes($usuario);
    
    
    //montando consulta sql para consultar usuario e senha
    $endereco= mysqli_connect("localhost","lincoln_tx","715298","tecweb");
    $sql="Select * from {$_SG['tabela']} Where{$cS} Nome = '$nusuario' ";
    $query= mysqli_query($endereco, $sql);
    $resultado = mysqli_fetch_assoc($query);
    echo "{$resultado}";
    
    //verifica se algum registro foi encontrado 
    if(empty($resultado)){
        //caso não acha nenhum registro o usuario é invalido
        return FALSE;
    }else{
        if($_SESSION['validaSempre']==TRUE){
            $_SESSION['usuarioLogin']=$usuario;        
        }
        return TRUE;
    }//fim do else
    
}//fecha validaUser

if($_SERVER['REQUEST_METHOD']=="POST"){
    
  $usuario=(isset($_POST['pesquisa']))?$_POST['pesquisa']:'';//o isset é usado para verificar se o campo foi preenchida
  $_SESSION['pesquisa']= $usuario;
  if(validaUser($usuario)==TRUE){
   
    header("Location:../view/Historico.php");
    die();
} else {
  $erro="Usuário informado não existe!";
  $_SESSION['erro']=$erro;
  $_SESSION['cont']=2;
  header("Location:../view/paginainicial.php");
}
  
}
  
  