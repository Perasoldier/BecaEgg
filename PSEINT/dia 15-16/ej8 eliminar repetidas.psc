//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
//		al no estar repetidas.
Algoritmo eliminarVocalesRepetidas
	
	Definir frase como Caracter
	Escribir "Ingrese una frase"
	leer frase
	frase = Minusculas(frase)
	eliminarRepetidas(frase)
	Escribir ""
FinAlgoritmo

SubProceso eliminarRepetidas(frase)
	Definir conta, conte, conti, conto, contu como Logico
	Definir i Como Entero
	Definir letraActual como Caracter
	
	conta = falso
	conte = falso
	conti = falso
	conto = falso
	contu = falso
	
	Para i = 0 Hasta longitud(frase)-1 Hacer
		letraActual = subcadena(frase, i , i)
		Si letraActual <> "a" y letraActual <> "e" y letraActual <> "i" y letraActual <> "o" y letraActual <> "u" Entonces
			Escribir sin saltar letraActual
		SiNo
			si letraActual == "a" y conta = falso Entonces
				Escribir sin saltar letraActual
				conta = verdadero
			FinSi
			si letraActual == "e" y conte = falso Entonces
				Escribir sin saltar letraActual
				conte = verdadero
			FinSi
			si letraActual == "i" y conti = falso Entonces
				Escribir sin saltar letraActual
				conti = verdadero
			FinSi
			si letraActual == "o" y conto = falso Entonces
				Escribir sin saltar letraActual
				conto = verdadero
			FinSi
			si letraActual == "u" y contu = falso Entonces
				Escribir sin saltar letraActual
				contu = verdadero
			FinSi
		FinSi
	Fin Para
FinSubProceso