//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo sin_titulo
	Definir num, aux, unidad, decena Como Entero
	Escribir "Número de 2 cifras: "
	Leer num //43
	unidad = num%10 //3
	decena = trunc(num/10)%10 //4
	
	Escribir unidad decena
	
	unidad = unidad*10 //30
	aux = unidad + decena //34
	Escribir aux
	
FinAlgoritmo