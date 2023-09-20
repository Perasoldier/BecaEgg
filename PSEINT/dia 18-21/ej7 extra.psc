
//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])

// mi top mayonesas   hellmans>heinz>natura>todas las demas
Algoritmo milanesas
	definir vector,i Como Entero
	
	dimension vector[4]
	
	Para i=0 Hasta 3 Hacer
		vector[i]=Aleatorio(1,100)
		Escribir "La posicion ", i+1, " es: ", vector[i]
	Fin Para
	
	escribir "El resultado de la multiplicacion es: " ,multiplicacion(vector)
	
	
	
	
FinAlgoritmo

Funcion resultadoMultiplicacion <- Multiplicacion(vector)
	definir resultadoMultiplicacion , i Como Entero
	resultadoMultiplicacion = 1
	Para i=0 Hasta 3 hacer
		resultadoMultiplicacion = resultadoMultiplicacion * vector[i]
	Fin Para
	
Fin Funcion
