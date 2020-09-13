Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: scenario description
Given Abrir Chrome
When ingresar Username "sergio" y Password "1234"
Then iniciar sesion 


    Scenario: registrar hora fecha
        Given ir a la pagina de registro de hora
        When ingresar i_opc "4" rut "135809179" nombreMascota "lucas" hora "17:30" fecha "2020-12-10"
        Then Registrar hora medica1