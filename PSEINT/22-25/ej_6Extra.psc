//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
//realiza la multiplicación entre matrices consultar el siguiente link:

Algoritmo ej_6Extra
	
	Definir matriz, multiplicar,resultado, i , j ,num Como Entero
	definir encontrado Como Logico
	Dimension matriz[3,3]
	Dimension resultado[3,3]
	dimension multiplicar[3]
	para i<-0 hasta 2 Hacer
		para j<-0 Hasta 2 Hacer
			matriz[i,j]=Aleatorio(1,9)
		FinPara
	FinPara
	
	para i<-0 hasta 2 Hacer
			multiplicar[i]=Aleatorio(1,9)
	FinPara
	
	para i<-0 hasta 2 Hacer
		para j<-0 Hasta 2 Hacer
			escribir Sin Saltar matriz[i,j], "  "
		FinPara
		Escribir ""
	FinPara
	Escribir ""

	para i<-0 hasta 2 Hacer
		escribir Sin Saltar multiplicar[i], "  "	
	FinPara
	
	Escribir ""
	escribir ""
	
	para i<-0 hasta 2
		para j<-0 hasta 2
			si i==0 Entonces
				resultado[i,j]=matriz[i,j] * multiplicar[j]
			FinSi
			si i==1 Entonces
				resultado[i,j]=matriz[i,j] * multiplicar[j]
			FinSi
			si i==2 Entonces
				resultado[i,j]=matriz[i,j] * multiplicar[j]
			FinSi
		FinPara
	FinPara
	
	para i<-0 hasta 2 Hacer
		para j<-0 Hasta 2 Hacer
			escribir Sin Saltar resultado[i,j], "  "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
