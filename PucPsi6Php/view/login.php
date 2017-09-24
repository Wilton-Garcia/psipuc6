<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<?php
session_start();
if($_SESSION['cont']==1){
    $_SESSION['erro']="";
}
else{
    
}
?>
<!Doctype html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
           <link rel="stylesheet" type="text/css" href="css/layout.css"/>
    </head>
    <body> 
        <div id="login" class="myform">
            <h3>Digite o seu email e senha para fazer login</h3>
            <form name="form_login" action="../controller/LoginController.php" method="POST">
                <span><?= $_SESSION['erro']?> </span>
                <p>Email</p><input type="text" name="email" required/>
                <p>Senha</p><input type="password" name="senha" required/>
                <input type="submit"/>
                <a href="cadastroDoador.html">Cadastrar</a>
            </form>
        </div>
    </body>
</html>
