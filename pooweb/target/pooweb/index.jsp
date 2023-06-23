<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    
    <title>Calculadora de area</title>
</head>
<header id="header-top">
    <h4>Calculadora de areas</h4>
</header>
    
    
    
<body>
    <h2>Bienvenido al programa</h2>
    <p>Este programa te ayuda a calcular el área de una figura</p>
    <p>Por favor elije una de las siguientes figuras</p>
    <div class="container">
        <a href="servlet?control=trapecio" class="btn"><img src="img/imagen1.png" alt=""></a>
        <a href="servlet?control=triangulo" class="btn"><img src="img/imagen2.png" alt=""></a>
        <a href="servlet?control=rectangulo" class="btn"><img src="img/imagen3.png" alt=""></a>
        <a href="servlet?control=circulo" class="btn"><img src="img/imagen4.png" alt=""></a>
    </div>
</body>
</html>