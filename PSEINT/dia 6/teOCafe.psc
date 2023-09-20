//diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
//en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si
//prefiere leche vegetal.
Algoritmo teOCafe
	
	Definir respuesta, respuesta2, respuesta3 Como Caracter
	Escribir "Quiere tomar té o café?"
	leer respuesta 
	
	Si respuesta == "café" Entonces
		Escribir "Solo o cortado?"
		leer respuesta2
		Si respuesta2 == "cortado" Entonces
			Escribir "Con leche vegetal o normal?"
			leer respuesta3
			Si respuesta3 == "leche vegetal" Entonces
				Escribir "Servir café con leche vegetal"
			SiNo
				Escribir "Servir café con leche normal"
			Fin Si
		SiNo
			Escribir "Servir café solo"
		Fin Si
	SiNo
		Escribir "Servir té"
	Fin Si
	
FinAlgoritmo
