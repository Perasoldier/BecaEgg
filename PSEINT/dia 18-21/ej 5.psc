Algoritmo sin_titulo
	Definir longVector,vector, i Como entero
	Escribir "Ingrese el largo del vector:"
	leer longVector
	Dimension vector[longVector]
	
	para i=0 hasta (longVector-1) Hacer
		Escribir "Ingrese el numero ", i+1, ":"
		leer vector[i]
	FinPara
	
	escribir  "EL valor maximo en el vector es: " , nVectorMaximo(vector,longVector)
	
FinAlgoritmo

funcion resultado=nVectorMaximo(vector,longVector) 
	definir resultado,maximo,k Como entero
	maximo=0
	Para k=0 Hasta (longVector-1) Hacer
		//Escribir "comparando ", k," ", maximo," ", vector[k]
		si vector[k]>maximo Entonces
			maximo = vector[k]
		FinSi
	Fin Para
	resultado=maximo
FinFuncion
	