

Algoritmo Factorial
	Definir i, num, fact Como Entero
	Escribir "Escriba un número para extraer su factorial"
	leer num
	/// Bucle para solicitar un número entero positivo
	Mientras num <= 0 Hacer
		Escribir "Digite un número entero positivo"
		leer num
	FinMientras
	
	fact = num ///Se almacena el valor del número ingresado en una variable
	
	/// Bucle para hacer el producto del numero restando una unidad hasta llegar a 1
	Para i <- 1 Hasta num-1 Con Paso 1 Hacer
		fact = fact*i
	FinPara
	Escribir "El factorial de ", num, "! es ", fact
FinAlgoritmo