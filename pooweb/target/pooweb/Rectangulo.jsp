<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Rectangulo</title>
</head>
<body> 
    <h4>Vamos a calcular el area</h4>
    <section class="registro">
        <h4>Ingresa los siguientes datos</h4>
        <form action="servlet" method="post">
            <input class="controls" type="text" name="base"placeholder="Ingrese la base del rectagulo">
            <input class="controls" type="text" name="altura"placeholder="Ingrese la altura del rectagulo">
            <button class="boton"type="submit" name="control" value="arearect">
                Enviar
           </button>
            <a href="index.jsp" class="boton">Volver</a>
        </form>
    </section>
    
</body>
</html>