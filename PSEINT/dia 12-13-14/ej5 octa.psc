Funcion numr <- primo(x)
	definir i, j Como Entero
	definir numr como logico
	
	j=0
	
	Para i <- 1 hasta x hacer
		si x mod i == 0 Entonces
			j=j+1
		FinSi
	FinPara
	
	si j==2 Entonces
		numr=Verdadero
	sino
		numr= falso
	finsi
	
FinFuncion

Algoritmo funcion_numPrimo
	Definir num Como Entero
	Escribir "Ingrese un número"
	Leer num
	Escribir primo(num)
FinAlgoritmo