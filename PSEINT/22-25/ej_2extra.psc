//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.
//La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por
//columnas (o viceversa).
Algoritmo ej_2extra
	Definir matriz, n,m,i,j Como Entero
	i=0
	j=0
	Escribir "Dimension X:"
	leer n
	Escribir "Dimension Y:"
	leer m
	Dimension matriz[n,m]
	
	llenadoMatriz(matriz,n,i,j)
	impresion(matriz,n,i,j)
	escribir ""
	traspuesta(matriz,n,i,j)
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

SubProceso traspuesta(matriz,n,i,j)
	para j<-0 hasta n-1 Hacer
		para i<-0 hasta n-1 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara

FinSubProceso
