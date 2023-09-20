//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
Algoritmo promedio_suma
	Definir n,vector,i, suma Como entero
	Definir promedio Como Real
	suma=0
	Escribir "Ingrese el largo del vector:"
	leer n
	Dimension vector[n]
	
	para i=0 hasta (n-1) Hacer
		Escribir "Ingrese el numero ", i+1, ":"
		leer vector[i]
		suma=suma+vector[i]
	FinPara
	
	escribir "El promedio de los ",n," numeros ingresados es : ", suma/n
	
FinAlgoritmo
