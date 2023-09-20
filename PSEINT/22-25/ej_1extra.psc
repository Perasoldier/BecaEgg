//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo ej_1extra
	Definir matriz, n,i,j Como Entero
	i=0
	j=0
	Escribir "dimension:"
	leer n
	Dimension matriz[n,n]
	
	llenadoMatriz(matriz,n,i,j)
	impresion(matriz,n,i,j)
	
FinAlgoritmo

SubProceso llenadoMatriz(matriz,n,i,j)
para i<-0 hasta n-1 Hacer
	para j<-0 hasta n-1 Hacer
		matriz[i,j]=Aleatorio(0,99)
	FinPara
FinPara
FinSubProceso

SubProceso impresion(matriz,n,i,j)
para i<-0 hasta n-1 Hacer
	para j<-0 hasta n-1 Hacer
		Escribir Sin Saltar matriz[i,j], " "
	FinPara
	Escribir ""
FinPara
FinSubProceso
