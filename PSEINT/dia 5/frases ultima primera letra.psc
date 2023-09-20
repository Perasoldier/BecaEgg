Algoritmo punto7
	definir frase Como Caracter
	definir var como entero
	
	escribir "escribe una frase o palabra"
	leer frase
	
	var = Longitud(frase) - 1
	Si subcadena(frase,0,0) == subcadena(frase,var,var) Entonces
		escribir "CORRECTO"
	SiNo
		escribir "INCORRECTO"
	Fin Si
	
FinAlgoritmo