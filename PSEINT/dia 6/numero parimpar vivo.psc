//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni
//impar". Nota: investigar la funci�n mod de PSeInt


Algoritmo ejercicio2
	definir num1  como entero
	escribir "Ingresar un numero entero"
	leer num1
	si num1==0 entonces 
		escribir "El numero no es par ni impar"
	SiNo
		num1=num1%2
		si num1==0 Entonces
			escribir "Es un numero par"
		SiNo
			si num1 <>0 Entonces
				escribir "Es un numero impar"
				
			FinSi
		FinSi
	FinSi