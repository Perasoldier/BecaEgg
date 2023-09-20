//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//	de prueba:
//		x Producir menos de 200 tornillos defectuosos.
//		x Producir m�s de 10000 tornillos sin defectos.
//	x El grado de eficiencia se determina de la siguiente manera:
//		x Si no cumple ninguna de las condiciones, grado 5.
//			x Si s�lo cumple la primera condici�n, grado 6.
//				x Si s�lo cumple la segunda condici�n, grado 7.
//					x Si cumple las dos condiciones, grado 8

Algoritmo grado_eficiencia
	
	Definir cond1, cond2 Como Logico
	definir def, sindef Como Entero
	
	Escribir "tornillos defectuosos: " 
	leer def
	Escribir "tornillos sin defectos: "
	leer sindef
	
	Si def>=200 Entonces
		cond1 = Falso
	SiNo
		Cond1 = Verdadero
	Fin Si
	
	Si sindef >=10000 Entonces
		cond2 = Verdadero
	SiNo
		cond2 = Falso
	Fin Si
	
	Si cond1 == falso y cond2 == Falso Entonces
		escribir "Es grado 5"
	SiNo
		Si cond1== verdadero y cond2 == falso Entonces
			Escribir "Es grado 6"
		SiNo
			Si cond1== Falso y cond2 == Verdadero Entonces
				Escribir "Es grado 7"
			SiNo
				Si cond1== Verdadero y cond2 == Verdadero Entonces
					Escribir "Es Grado 8"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
