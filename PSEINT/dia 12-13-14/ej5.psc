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

//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.



Algoritmo Dia12Ejercicio5
	
	Definir num Como Real
	Escribir "Ingresa un n�mero y te dir� si es primo"
	Leer num
	Escribir "El n�mero ingresado es primo: " esPrimo(num)
	
	
FinAlgoritmo
