//Realizar un programa que rellene de n�meros aleatorios una matriz a trav�s de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo ej_4extra
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
