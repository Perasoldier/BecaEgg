Algoritmo sin_titulo
	definir num , contadorPar, contadorImpar, sumaPar, sumaImpar Como Real
	contadorImpar = 0
	contadorPar = 0
	sumaImpar = 0
	sumaPar = 0
	Hacer
		Escribir "Ingrese numero:"
		Leer num
		Mientras num MOD 2 == 0 o (contadorPar+contadorImpar)<10 
			sumaPar= sumaPar+num
			contadorPar = contadorPar+1
			Escribir  "ingrese numero"
			Leer num 
		Fin Mientras
		
		Mientras num MOD 2 <> 0  o (contadorPar+contadorImpar)<10 
			sumaImpar = sumaImpar + num
			contadorImpar = contadorImpar +1
			Escribir "ingrese numero: "
			Leer num
		Fin Mientras
		sumaPar= sumaPar+num
		contadorPar = contadorPar+1
		
		
		
	Mientras Que (contadorPar+contadorImpar)<10 
	
FinAlgoritmo
