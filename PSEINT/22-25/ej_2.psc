//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo ej2
	Definir matriz, i , j ,num Como Entero
	definir encontrado Como Logico
	Dimension matriz[5,5]
	
	para i<-0 hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
			matriz[i,j]=Aleatorio(0,10)
		FinPara
	FinPara
	
	para i<-0 hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
			escribir Sin Saltar matriz[i,j], "  "
		FinPara
		Escribir ""
	FinPara	
	
	Escribir "Ingrese valor a buscar:"
	leer num
	encontrado=Falso
	
	para i<-0 hasta 4 Hacer		
		para j<-0 Hasta 4 Hacer
			si matriz[i,j] == num entonces
				encontrado = verdadero
				escribir Sin Saltar i,"  ",j, "  "
				Escribir ""
			FinSi
			
		FinPara
	FinPara	
	si encontrado == Falso Entonces
		Escribir "El Numero no se encontro!"
	FinSi
FinAlgoritmo
