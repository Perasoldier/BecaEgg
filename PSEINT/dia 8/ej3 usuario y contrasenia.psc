//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
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