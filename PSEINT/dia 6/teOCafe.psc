//dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
//en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si
//prefiere leche vegetal.
Algoritmo teOCafe
	
	Definir respuesta, respuesta2, respuesta3 Como Caracter
	Escribir "Quiere tomar t� o caf�?"
	leer respuesta 
	
	Si respuesta == "caf�" Entonces
		Escribir "Solo o cortado?"
		leer respuesta2
		Si respuesta2 == "cortado" Entonces
			Escribir "Con leche vegetal o normal?"
			leer respuesta3
			Si respuesta3 == "leche vegetal" Entonces
				Escribir "Servir caf� con leche vegetal"
			SiNo
				Escribir "Servir caf� con leche normal"
			Fin Si
		SiNo
			Escribir "Servir caf� solo"
		Fin Si
	SiNo
		Escribir "Servir t�"
	Fin Si
	
FinAlgoritmo
