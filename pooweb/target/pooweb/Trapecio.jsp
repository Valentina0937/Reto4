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
    <h4>Vamos a calcular el area del Trapecio</h4>
    <section class="registro">
        <h4>Ingresa los siguientes datos</h4>
        <!-- <form action="servlet" method="post">
            <label>Base menor</label>
            <input type="text" name="basemenor">
            <label>Base mayor</label>
            <input type="text" name="basemayor">
            <label>Altura</label>
            <input type="text" name="altura">
            <button type="submit" name="control" value="areatra">
                Enviar
           </button>
        </form> -->
        <form action="servlet" method="post">
            <input class="controls" type="text" name="basemenor"placeholder="Ingrese la base menor del trapecio">
            <input class="controls" type="text" name="basemayor"placeholder="Ingrese la base mayor del trapecio">
            <input class="controls" type="text" name="altura"placeholder="Ingrese la altura del trapecio">
            <button class="boton" type="submit" name="control" value="areatra">
                Enviar
           </button>
            <a href="index.jsp" class="boton">Volver</a>
        </form>

    </section>
    
</body>
</html>