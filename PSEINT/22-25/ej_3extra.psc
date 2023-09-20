//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo ej_3extra
	Definir matriz, n,m,i,j Como Entero
	
	Dimension matriz[5,15]
	
	para i<-0 hasta 4 Hacer
		para j<-0 hasta 14 Hacer
			si i==0 o i==4 Entonces
				matriz[i,j]=1
			SiNo
				matriz[i,j]=0
			finsi	
			si j==0 o j==14 Entonces
				Matriz[i,j]=1
			FinSi
		FinPara
	FinPara
	
	para i<-0 hasta 4 Hacer
		para j<-0 hasta 14 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo

//SubProceso llenadoMatriz(matriz,n,i,j)
//para i<-0 hasta n-1 Hacer
//	para j<-0 hasta n-1 Hacer
//		matriz[i,j]=Aleatorio(0,99)
//	FinPara
//FinPara
//FinSubProceso
//
//SubProceso impresion(matriz,n,i,j)
//para i<-0 hasta n-1 Hacer
//	para j<-0 hasta n-1 Hacer
//		Escribir Sin Saltar matriz[i,j], " "
//	FinPara
//	Escribir ""
//FinPara
//FinSubProceso
//
//SubProceso traspuesta(matriz,n,i,j)
//	para j<-0 hasta n-1 Hacer
//		para i<-0 hasta n-1 Hacer
//			Escribir Sin Saltar matriz[i,j], " "
//		FinPara
//		Escribir ""
//	FinPara
//
//FinSubProceso
