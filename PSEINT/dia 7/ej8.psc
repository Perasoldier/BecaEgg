Algoritmo ej8
	Definir num Como Real
	Definir contador Como Entero
	contador = 0
	Escribir "Ingresa un numero"
	Leer num
	Mientras num > 0 Hacer
		num = trunc(num/10)
		contador = contador+1
	Fin Mientras
	Escribir "El numero ingresado tiene ", contador, " digitos"
	
FinAlgoritmo