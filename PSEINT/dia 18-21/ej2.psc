//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.
Algoritmo sarasa
	Definir vector, i Como Real
	Dimension vector[10]
	
	para i=0 hasta 9 Hacer
		Escribir "Ingrese el numero ", i+1, ":"
		leer vector[i]
	FinPara
	
	Escribir "La suma de los 10 numeros es: ", suma(vector)
	Escribir "La resta de los 10 numeros es: ", resta(vector)
	Escribir "La multiplicacion de los 10 numeros es: ", multi(vector)
	
FinAlgoritmo

Funcion resultadosuma=suma(vector)
	definir resultadosuma como real
	definir i Como Entero
	resultadoSuma=0
	
	Para i=0 hasta 9 Hacer
		resultadoSuma = resultadoSuma+vector[i]
	FinPara
FinFuncion

Funcion resultadoResta=resta(vector)
	definir resultadoResta como real
	definir i Como Entero
	resultadoResta=0
	
	Para i=0 hasta 9 Hacer
		resultadoResta = resultadoResta-vector[i]
	FinPara
FinFuncion

Funcion resultadoMulti = multi(vector)
	definir resultadoMulti como real
	definir i Como Entero
	resultadoMulti=1
	
	Para i=0 hasta 9 Hacer
		resultadoMulti = resultadoMulti*vector[i]
	FinPara
FinFuncion