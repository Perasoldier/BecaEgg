Algoritmo sin_titulo
    Definir matrixFinal , palabra Como caracter
    Definir filas,col , i  Como Entero
    filas = 9
    col = 12
	palabra=" "
    Dimension matrixFinal[filas,col]
	
    inicializarMatriz(matrixFinal,filas,col)
    imprimirMatriz(matrixFinal,filas,col)
	Escribir "Matriz inicializada"
    agregarPalabras(matrixFinal, filas, col)
    imprimirMatriz(matrixFinal,filas,col)
	buscarR(matrixFinal,filas,col)
FinAlgoritmo

SubProceso inicializarMatriz(matrix,filas,col)
    Definir i, j Como Entero	
    Para i = 0 Hasta filas -1 Hacer
        Para j = 0 Hasta col -1 Hacer
			matrix[i,j] = "*"
        FinPara
    FinPara
	
FinSubProceso


SubProceso imprimirMatriz(matrix,filas,col)
    Definir i, j Como Entero
	
    Para i = 0 Hasta filas -1 Hacer
        Para j = 0 Hasta col -1 Hacer
            escribir sin saltar matrix[i,j] " "
        FinPara
        Escribir ""
    FinPara
FinSubProceso

SubProceso agregarPalabras(matrix,fila, col)
    Definir i , j Como Entero
	Definir palabra,vectorPalabra Como Caracter
	Dimension vectorPalabra[9]
	vectorPalabra[0]="VECTOR"
	vectorPalabra[1]="MATRIS"
	vectorPalabra[2]="PROGRAMA"
	vectorPalabra[3]="SUBPROGRAMA"
	vectorPalabra[4]="SUBPROCESO"
	vectorPalabra[5]="VARIABLE"
	vectorPalabra[6]="ENTERO"
	vectorPalabra[7]="PARA"
	vectorPalabra[8]="MIENTRAS"
	
    para i = 0 Hasta fila - 1 Hacer
			Para j = 0 hasta Longitud(vectorPalabra[i])-1 Hacer
                matrix[i,j] = Subcadena(vectorPalabra[i],j,j)
		FinPara
    FinPara
FinSubProceso


subproceso buscarR(matrix,filas,col)
	definir ubicacion ,i,j como entero
	Para i = 0 Hasta filas -1 Hacer
        Para j = 0 Hasta col -1 Hacer
			si matrix[i,j]=="R" Entonces
				ubicacion=j
				Escribir "La R se encontro en la posicion : ", ubicacion, " de la fila " ,i+1
				j=col-1
			FinSi
        FinPara
	FinPara
FinSubProceso
