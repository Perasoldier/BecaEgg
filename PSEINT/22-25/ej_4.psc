//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.

Algoritmo ej_4
	
	definir matrix , i , j , m , n Como Entero
	
	Escribir "Ingresar tamano m(x)"
	leer m
	Escribir "Ingresar tamano n(y)"
	leer n
	
	Dimension matrix[m,n]
	
	rellenar(matrix,m,n)
	mostrarme(matrix,m,n)
	
FinAlgoritmo

SubProceso rellenar(m4trix,m,n)
	Definir i , j Como Entero
	Para i = 0 Hasta  m - 1 Hacer
		para j = 0 hasta n -1 Hacer
			si i==j Entonces
				m4trix[i,j] = 0
			SiNo
				m4trix[i,j] = Aleatorio(1,99)
			FinSi
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarme(m4trix,m,n)
	Definir i , j Como Entero
	Para i = 0 Hasta  m - 1 Hacer
		para j = 0 hasta n -1 Hacer
			Escribir sin saltar m4trix[i,j] "   "
		FinPara
		Escribir " "
	FinPara
	
FinSubProceso


