<?php
session_start();
?>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>Histórico</title>
        <link rel="stylesheet" type="text/css" href="css/estiloHistorico.css"/>
    </head>
    <body>
        <table class="container">
	<thead>
		<tr>
                    <th><h1>Nome</h1></th>
                    <th><h1>Data da Doação</h1></th>
                    <th><h1>Descrição da Doação</h1></th>
                   
		</tr>
	</thead>
	<tbody>
            <?php

$nusuario=$_SESSION['pesquisa'];
$endereco= mysqli_connect("localhost","lincoln_tx","715298","tecweb");
$sql="Select U.Nome,D.Data_doacao,D.Desc_item from doacoes_user D, usuarios U Where U.Id_User = D.Id_usuario AND U.Nome='$nusuario' ";
$query= mysqli_query($endereco, $sql);
while($fetch= mysqli_fetch_row($query)){
    echo '<tr>';
    foreach ($fetch as $value){
        
        echo '<td>'. $value.'</td>';
    }
    echo '</tr>';
}
?>
	</tbody>
</table>
    </body>
</html>




