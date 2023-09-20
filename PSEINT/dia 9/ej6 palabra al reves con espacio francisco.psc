//Corregido anterior

Algoritmo Ejercicio6
	// Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
	//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
	//  deberemos mostrar a l o H.
	
	Definir frase como cadena
	Definir i Como Entero
	
	Escribir "Ingresa una frase para que sea espaciada"
	Leer frase
	
	Para i = longitud(frase)-1 Hasta 0 con paso -1 Hacer
		Escribir sin saltar Subcadena(frase, i, i), " "
		Si i == 0 Entonces
			Escribir sin saltar "."
		FinSi
		
		
	FinPara 
	
	Escribir ""
FinAlgoritmo