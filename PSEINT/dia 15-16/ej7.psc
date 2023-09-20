Algoritmo ejercicio07
	
	Definir altura Como Entero
	
	Escribir "ingrese la altura de la escalera"
	Leer altura
	escalera(altura)
	
FinAlgoritmo


SubProceso escalera(altura)
	
	Definir i, j Como Entero
	
	para i <- 1 hasta altura Hacer
		para j <- 1 hasta i Hacer
			Escribir j Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso