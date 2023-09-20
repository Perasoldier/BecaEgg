Algoritmo desafio
	Definir matriz1 Como Caracter
	Definir filas, columnas Como Entero
	filas = 9
	columnas = 12
	
	Dimension matriz1[filas,columnas]
	inicializarMatriz(matriz1)
	//	imprimirMatriz(matriz1, filas, columnas)
	agregarPalabra(matriz1)
	imprimirMatriz(matriz1, filas, columnas)
	buscarR(matriz1)
	acomodarPalabra(matriz1)
FinAlgoritmo

SubProceso inicializarMatriz(matriz1)
	Definir i, j Como Entero
	Para i= 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 hacer
			matriz1[i,j] = "*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz1,filas,columnas)
	Definir i, j Como Entero
	Para i = 0 Hasta filas -1 Hacer
		Para j = 0 hasta columnas -1 hacer
			Escribir sin saltar matriz1[i,j] " "
		FinPara
		Escribir ""
	FinPara	
FinSubProceso

SubProceso agregarPalabra(matriz1)
	Definir i, j Como Entero
	Definir vectorPalabras como cadena
	Dimension vectorPalabras[9]
	vectorPalabras[0] = "vector"
	vectorPalabras[1] = "matrix"
	vectorPalabras[2] = "programa"
	vectorPalabras[3] = "subprograma"
	vectorPalabras[4] = "subproceso"
	vectorPalabras[5] = "variable"
	vectorPalabras[6] = "entero"
	vectorPalabras[7] = "para"
	vectorPalabras[8] = "mientras"
	
	Para i = 0 hasta 8 Hacer
		Para j = 0 hasta Longitud(vectorPalabras[i])-1 Hacer
			matriz1[i, j] = Subcadena(vectorPalabras[i], j, j)
		FinPara
	FinPara	
FinSubProceso

SubProceso buscarR(matriz1)
	Definir i, j, ubicacion,retorno Como Entero
	Para i= 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 hacer
			Si matriz1[i, j ] == "r" Entonces
				retorno = j
				j = 11
			FinSi
		FinPara
		Escribir "En la fila " i, " la R se encuentra en la posicion: " retorno 	
	FinPara
	
	
FinSubProceso
SubProceso acomodarPalabra(matriz1)
	definir i,j,pos Como Entero
	
	
	Para i= 0 Hasta 8 Hacer
		
		Para j = 0 Hasta 11 hacer
			Si matriz1[i, j ] == "r" Entonces
				matriz1[i,5]=matriz1[i,j]
			
			FinSi
			escribir Sin Saltar matriz1[i,j] " "
		FinPara
		escribir " "
	FinPara
	
FinSubProceso
	