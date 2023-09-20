//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. 
//Despues, crearemos otro subprograma que calcule y muestre la suma de los elementos de la matriz. 
//Mostrar la matriz y los resultados por pantalla.


Algoritmo ej3
	definir matrix , i , j , m , n Como Entero
	
	Escribir "Ingresar tamano m(x)"
	leer m
	Escribir "Ingresar tamano n(y)"
	leer n
	
	Dimension matrix[m,n]
	
	rellenar(matrix,m,n)
	mostrarme(matrix,m,n)
	sumar(matrix,m,n)
	
FinAlgoritmo

SubProceso rellenar(m4trix,m,n)
	Definir i , j Como Entero
	Para i = 0 Hasta  m - 1 Hacer
		para j = 0 hasta n -1 Hacer
			m4trix[i,j] = Aleatorio(0,1)
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

SubProceso sumar(m4trix,m,n)
	Definir i , j , suma Como Entero
	suma = 0
	Para i = 0 Hasta  m - 1 Hacer
		para j = 0 hasta n -1 Hacer
			suma = suma + m4trix[i,j] 
		FinPara
	FinPara
	Escribir "El total de la matrix es: " suma
FinSubProceso