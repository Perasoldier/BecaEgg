//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo sin_titulo
	definir matriz, i,j , sumaI, sumaJ, max,columna ,n como entero
	definir magico como logico
	max=0
	sumaI=0
	sumaJ=0
	dimension matriz[7,6]
	Para i = 0 Hasta 4 Hacer
		para j = 0 hasta 5 Hacer
			si j<=4
			matriz[i,j] = Aleatorio(1,9)
			sumaI= sumaI+matriz[i,j]
		FinSi
		
			si j==5
				matriz[i,j]=sumaI
			FinSi
		FinPara
		sumaI=0
	FinPara
	Para i<-5 Hasta 5 Hacer
		para j = 0 hasta 5 Hacer
			si j<=4
				matriz[i,j] = 0
				sumaI= sumaI+matriz[i,j]
			FinSi
			si j==5
				matriz[i,j]=sumaI
			FinSi
		FinPara
	FinPara
	
	para i<-0 hasta 5
		para j<-5 hasta 5
			si matriz[i,j]>max
				max=matriz[i,j]
			FinSi
		FinPara
		matriz[5,5]=max
	FinPara
	
	para j<-0 hasta 4
		para i<-0 hasta 5
			si i<=4
				sumaj=sumaJ+ matriz[i,j]
			FinSi
			si i==5
				matriz[i,j]=sumaJ
			FinSi
			
		FinPara
		sumaJ=0
	FinPara
	
	
//	Para j<-0 Hasta 5 Hacer
//		para i<-5 hasta 5 Hacer
//			sumaj= sumaJ+matriz[i,j]
//		FinPara
////		columna[j]=sumaJ
//		Escribir "suma columna ",j+1," :" sumaj
//		sumaJ=0
//	FinPara
	
	Para i = 0 Hasta 5 Hacer
		para j = 0 hasta 5 Hacer
			si i<=4
				Escribir sin saltar matriz[i,j] "   "
			FinSi
			si i==5
				Escribir sin saltar matriz[i,j] "  "
			FinSi
		FinPara
		Escribir " "
	FinPara
	
	escribir max
FinAlgoritmo
