//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña
//4567. El programa finaliza cuando ingresa los datos correctos.
Algoritmo Ej3
	definir codigo, codigo2, contrasenia, contrasenia2 Como Entero
	codigo=1024
	contrasenia=4567
	Hacer
		escribir "ingrese su codigo"
		leer codigo2
		escribir "ingrese su contrasenia"
		leer contrasenia2
		
	Mientras Que codigo <> codigo2 o contrasenia <> contrasenia2
	escribir "Ingreso correctamente!"
	
FinAlgoritmo