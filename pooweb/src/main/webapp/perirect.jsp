<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Trapecio</title>
</head>
<body> 
    <h4>Vamos a calcular el perimetro del Rectangulo</h4>
    <section class="registro">
        <h4>Ingresa los siguientes datos</h4>
        <form action="servlet" method="post">
        <input class="controls" type="text" name="base"placeholder="Ingrese la base del rectangulo">
        <input class="controls" type="text" name="altura"placeholder="Ingrese la base del rectangulo">
        <button class="boton"type="submit" name="control" value="perimerec">
            Enviar
       </button>
        <a href="index.jsp" class="boton">Volver</a>
    </form>
    </section>
    
</body>
</html>