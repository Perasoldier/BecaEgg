Algoritmo precios
	
	Definir num Como Real 
	Escribir "Ingrese numero de 3 cifras: "
	Leer num
	
	Definir centena, decena, unidad Como Entero
	
	centena = trunc(num/100)
	Escribir "Centenas: " , centena
	
	decena = trunc(num/10)%10
	Escribir "Decenas: " , decena
	
	unidad = num%10
	Escribir "Unidades: " , unidad
	
FinAlgoritmo
