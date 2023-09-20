//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
//		mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
//			estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
//				tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.

Algoritmo sin_titulo
	Definir num, numMax, numMin, sumatoria, contador como Entero
	Definir prom como Real
	
	numMax = 0
	numMin = 1000
	contador = 0
	sumatoria = 0
	
	Hacer
		Escribir "Ingrese un numero entero positivo. Para salir ingrese 0"
		Leer num
		sumatoria = sumatoria + num
		si num > numMax y num > 0
			numMax = num
		FinSi
		si num < numMin y num > 0
			numMin = num
		FinSi
		contador = contador + 1
	Mientras Que num <> 0
	prom = sumatoria / (contador - 1)
	Escribir "El promedio es: ", prom
	Escribir "El maximo es: ", numMax
	Escribir "El minimo es: ", numMin
FinAlgoritmo