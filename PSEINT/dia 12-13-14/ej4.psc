Funcion resultado <- Buscarletra ( x, z )
	Definir resultado, i Como Entero
	
	resultado = 0
	
	Para i<-Longitud(x) Hasta 0 Hacer
		Si Subcadena(x, i, i) == z Entonces
			resultado = resultado + 1
		Fin Si
	Fin Para
Fin Funcion


Algoritmo ejercicio4
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese una frase"
	Leer frase
	Escribir "Ingrese una letra a buscar"
	Leer letra
	
	Escribir "La letra se encontro ", Buscarletra(frase, letra), " veces"
	
FinAlgoritmo