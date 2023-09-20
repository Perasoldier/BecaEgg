

Algoritmo ej_6
	definir matriz, i,j , sumaI, sumaJ, fila,columna ,n como entero
	definir magico como logico
	sumaI=0
	sumaJ=0
	Escribir "Defina la dimension de su matriz cuadrada:"
	leer n
	dimension matriz[n,n]
	dimension fila[n]
	Dimension columna[n]
	Para i = 0 Hasta n-1 Hacer
		para j = 0 hasta n-1 Hacer
			matriz[i,j] = Aleatorio(1,9)
			sumaI= sumaI+matriz[i,j]
		FinPara
		fila[i]=SumaI
//		Escribir "suma fila ",i+1," :" sumaI
		sumaI=0
	FinPara
	
	Para j = 0 Hasta n-1 Hacer
		para i = 0 hasta n-1 Hacer
			sumaj= sumaJ+matriz[i,j]
		FinPara
		columna[j]=sumaJ
//		Escribir "suma columna ",j+1," :" sumaj
		sumaJ=0
	FinPara

	para i<-0 hasta n-1 Hacer
		escribir "resultado fila ", i+1, " : ", fila[i]
		escribir "resultado columna ", i+1, " : ", columna[i]

	FinPara
	
	Para i = 0 Hasta n-1 Hacer
		para j = 0 hasta n-1 Hacer
			Escribir sin saltar matriz[i,j] "   "
		FinPara
		Escribir " "
	FinPara
	magico=Verdadero
	i= 0
	Hacer
		si fila[i]==columna[i] Entonces
			i=i+1
		SiNo
			magico=Falso
		FinSi		
	Mientras Que magico Y i<n
	
	si magico
		Escribir "Es matriz magica"
	SiNo
		Escribir "No es magica"
	FinSi
	
	
	
	
//	si fila[0]==fila[1] Y fila[1]==fila[2] Entonces
//		si columna[0]==columna[1] Y columna[1]==columna[2] Entonces
//			Escribir "Es una matriz magica"
//		SiNo
//			Escribir "No es una matriz magica"
//		FinSi
//	SiNo
//		Escribir "No es una matriz magica"
//	FinSi
	
FinAlgoritmo
