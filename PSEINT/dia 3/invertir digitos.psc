//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo invertido
	Definir num, aux, unidad, decena Como Entero
	Escribir "Introducir numero de 2 cifras: "
	Leer num
	
	unidad = num%10
	decena = trunc (num/10)%10
	
	escribir unidad "" decena
	
FinAlgoritmo
