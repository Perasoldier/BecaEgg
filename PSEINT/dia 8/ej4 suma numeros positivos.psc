//Se debe realizar un programa que:
//	1o) Pida por teclado un número (entero positivo).
//	2o) Pregunte al usuario si desea introducir o no otro número.
//		3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//		4o) Muestre por pantalla la suma de los números introducidos por el usuario.

algoritmo ej4
	Definir num, suma Como Entero
	definir decision Como Caracter
	suma = 0
	hacer
		Escribir "Ingrese numero entero positivo: "
		Leer num
		si	num > 0
			suma = suma+num
			Escribir " Desea ingresar otro numero: Y/N?: "
			Leer decision
			decision = Mayusculas(decision)
		FinSi
		si num < 0
			Escribir " Numero no valido"
			decision = "Y"
		FinSi
		
	Mientras Que decision <> "N"
	
	Escribir "La suma de los numeros ingresados es: ", suma
	
	
FinAlgoritmo
	