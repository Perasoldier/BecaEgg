//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
//realiza la multiplicación entre matrices consultar el siguiente link:

Algoritmo matrizXvector
	
	Definir matriz,vector,vectorProducto, matrizProducto,i,j,filas,columnas como numerico
	
	filas = 3
	columnas = 3
	
	Dimension matriz(filas, columnas), matrizProducto(filas, columnas), vector(filas), vectorProducto(filas)
	
	
	llenarMatrizAleatoria(matriz, filas, columnas)	
	Escribir "Matriz inicial" 
	mostrarMatriz(matriz, filas, columnas)
	

	Escribir ""
	Escribir ""
	
	Escribir "Vector inicial"
	para i = 0 Hasta filas - 1 Hacer
		vector(i) = Aleatorio(1,9)
		Escribir Sin Saltar "[" vector(i) "]"
	
	FinPara
	
	Escribir ""
	Escribir ""	
	Escribir "Productos parciales"
	multiplicarMatrizVector(matriz, vector, vectorProducto, matrizProducto, filas, columnas)
	mostrarMatriz(matrizProducto, filas, columnas)
	
	Escribir ""
	Escribir ""
	Escribir "Vector producto"
	para i = 0 Hasta filas - 1 Hacer
		
		Escribir Sin Saltar "[" vectorProducto(i) "]"
		
	FinPara
	
FinAlgoritmo

SubProceso llenarMatrizAleatoria(matriz, filas, columnas)	
	Definir i, j Como Entero
	Para i = 0 Hasta filas - 1 Hacer
		para j = 0 hasta columnas - 1
			matriz(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
	Escribir "Matriz generada de manera exitosa"
FinSubProceso

SubProceso mostrarMatriz(matriz, filas, columnas)
	Definir i, j Como Entero	
	Para i = 0 Hasta filas - 1 Hacer
		Escribir ""
		para j = 0 hasta columnas - 1
			Escribir Sin Saltar "[" matriz(i,j) "]"
			
		FinPara
	FinPara
FinSubProceso

SubProceso multiplicarMatrizVector(matriz, vector, vectorProducto, matrizProducto, filas, columnas)
	Definir i, j Como Entero

	Para i = 0 Hasta filas - 1 Hacer
		vectorProducto(i) = 0
		para j = 0 hasta columnas - 1
			matrizProducto(i,j) = matriz(i,j) * vector(j)
			vectorProducto(i) = matrizProducto(i,j) + vectorProducto(i)
		FinPara
	FinPara
FinSubProceso

