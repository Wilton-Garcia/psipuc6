<?php
session_start();
//inclui sistema de segurança

$erro="";
//verificação de envio de form


$_SG['conectaServidor']=TRUE;;//abre conexão com o mysql
$_SG['abreSessao']=FALSE;//Inicia a sessão 
$_SG['caseSensitive']=FALSE;// usa case sensitive
$_SG['validaSempre']=TRUE;// valida a cada login

//servidor

$_SG['paginaLogin']="Login.php";
$_SG['tabela']="login";

//verifica se é necessario iniciar a sessão 
if($_SG['abreSessao']==TRUE){
    session_start ();
}

//função de validação de usuario e senha
function validaUser($usuario,$senha){
    global $_SG;
    $cS = ($_SG['caseSensitive']) ? 'BINARY' : '';
    //usa a função addslashes para escapara as aspas
    $nusuario= addslashes($usuario);
    $nsenha= addslashes($senha);
    
    //montando consulta sql para consultar usuario e senha
    $endereco= mysqli_connect("localhost","lincoln_tx","715298","tecweb");
    $sql="Select * from {$_SG['tabela']} Where{$cS} Usuario = '$nusuario' And Senha = '$nsenha'";
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
            $_SESSION['usuarioSenha']=$senha;
        }
        return TRUE;
    }//fim do else
    
}//fecha validaUser

//função para explusar um usuário
function expulsar(){
    global $_SG;
    //remove vars da sessão 
    unset($_SESSION['usuarioLogin'],$_SESSION['usuarioSenha']);
    
    header("Location:Login.php");
}//fim do expulsar

if($_SERVER['REQUEST_METHOD']=="POST"){
    
  $usuario=(isset($_POST['email']))?$_POST['email']:'';//o isset é usado para verificar se o campo foi preenchida
  $senha= (isset($_POST['senha']))?$_POST['senha']:'';
  $_SESSION['user']=$usuario;
  
  
//valida os dados informados
if(validaUser($usuario, $senha)==TRUE){
   
    header("Location:../view/paginainicial.php");
    die();
} else {
  $erro="Usuário ou senha incorreto!";
  $_SESSION['erro']=$erro;
  $_SESSION['cont']=2;
  header("Location:../view/Login.php");
}
}
