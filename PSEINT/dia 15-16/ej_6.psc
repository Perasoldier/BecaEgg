//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.
Algoritmo ej_6
	Definir letra Como Caracter
	Escribir "Ingrese una letra"
	Leer letra
	letra= Mayusculas(letra)
	entreLetras(letra)
	
FinAlgoritmo

SubProceso entreLetras(letra)
		si letra >= "M"  Y letra <= "T"
		Escribir "La letra ingresada esta entre la M y la T"
	SiNo
		Escribir "La letra ingresada NO esta entre la M y la T"

	FinSi
	
FinSubProceso


