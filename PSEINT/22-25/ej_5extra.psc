//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5


Algoritmo ej_5extra
	Definir matriz,filas,i,j,suma Como Entero
	Escribir "Ingrese cantidad de filas"
	leer filas
	Dimension matriz[filas,3]
	
	para i<-0 hasta filas-1 Hacer
		suma=0
		para j<-0 hasta 2 Hacer
			si j<=1 entonces
				Escribir "Ingrese valor para la posicion (",i+1,",", j+1,")"
				leer matriz[i,j]
//				matriz[i,j]=Aleatorio(1,9)
				suma=suma+matriz[i,j]
			SiNo
				matriz[i,j]=suma
			FinSi
		FinPara
	FinPara
	
	para i<-0 hasta filas-1 Hacer
		para j<-0 hasta 2 Hacer
			si j==0 entonces
				Escribir Sin Saltar matriz[i,j], "+"
			FinSi
			si j==1 entonces
				Escribir Sin Saltar matriz[i,j], "="
			finSi
			si j==2
				Escribir Sin Saltar matriz[i,j], ""
			FinSi
		
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
