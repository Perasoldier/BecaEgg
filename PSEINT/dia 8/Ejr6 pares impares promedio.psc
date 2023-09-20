Algoritmo Ejr6
	// Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
	//    ingresará diez números.
	
	Definir numIng, contadorPar, contadorImp, sumaPar, sumaImp Como Entero
	sumaPar = 0
	sumaImp = 0
	contadorPar = 0
	contadorImp = 0 
	Hacer 
		Escribir "Ingrese un numero"
		Leer numIng
		Si numIng MOD 2 == 0
			sumaPar = sumaPar + numIng  
			contadorPar = contadorPar + 1
		FinSi
		Si numIng MOD 2 <> 0
			sumaImp = sumaImp + numIng
			contadorImp = contadorImp + 1
		FinSi
	Mientras Que (contadorPar + contadorImp) < 10
	
	Escribir "La media de los pares es: ", sumaPar / contadorPar
	Escribir "La media de los impares es: ", sumaImp / contadorImp
	
FinAlgoritmo