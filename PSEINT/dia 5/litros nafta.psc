Algoritmo punto8
	Definir cantHs, ltsgasolina, minutos Como Real 
	Escribir "Ingrese la cantidad de horas de uso" 
	leer cantHs
	minutos = cantHs*60
	Si cantHs <= 2 Entonces
		Escribir "Abona $400"
	Sino 
		Escribir "Ingrese la cantidad de litros de nafta gastados"
		Leer ltsgasolina
		Escribir "Abonara: " ,40*ltsgasolina+minutos*5.2 
	FinSi
FinAlgoritmo