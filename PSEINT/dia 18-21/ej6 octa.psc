Algoritmo sin_titulo
	Definir vector, frase, car como Caracter
	Definir i, pos como entero
	
	Dimension vector[20]
	
	Escribir "Ingrese una frase:"
	Leer frase
	
	///rellenar el vector con la frase
	para i <- 0 hasta 19 Hacer
		//hola = si i = 0 -> "h"
		vector[i] = subcadena(frase, i,i);
	FinPara
	
	//	para i <- 0 hasta 19 Hacer
	//		Escribir sin saltar "[",vector[i], "]"
	//	FinPara
	
	Escribir "Ingrese un caracter cualquiera"
	Leer car
	Escribir "Ingrese una posicion"
	Leer pos
	
	Si vector[pos] == " " Entonces
		vector[pos] = car
		para i <- 0 hasta 19 Hacer
			Escribir sin saltar "[",vector[i], "]"
		FinPara
	Sino 
		Escribir "Ocupado papa"
	FinSi
	
FinAlgoritmo

