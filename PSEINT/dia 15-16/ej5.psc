Algoritmo sin_titulo
	// Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
	// una cadena con un espacio adicional tras cada letra.
	// Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
	// dicho procedimiento.
	
	Definir frase como caracter
	Escribir "Escriba una frase"
	leer frase 
	espaciado(frase)
	
FinAlgoritmo

Subproceso  espaciado(fraseEspaciada)
	Definir frase, espacio como caracter
	Definir i como entero
	Para i = 0  Hasta longitud(fraseEspaciada)-1  Hacer
		escribir sin saltar concatenar(subcadena(fraseEspaciada, i, i), " ")  
	Fin Para
FinSubProceso