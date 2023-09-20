Funcion siesprimo <- esPrimo ( num )
	Definir siesprimo Como Logico
	Definir i, f Como Entero
	f= 0
	
	Para i =1 Hasta num Hacer
		si num mod i == 0
			f = f+1
		FinSi
	Fin Para
	
	si f == 2 Entonces
		siesprimo = Verdadero
	SiNo
		siesprimo = Falso
	FinSi
	
Fin Funcion

//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.



Algoritmo Dia12Ejercicio5
	
	Definir num Como Real
	Escribir "Ingresa un número y te diré si es primo"
	Leer num
	Escribir "El número ingresado es primo: " esPrimo(num)
	
	
FinAlgoritmo
