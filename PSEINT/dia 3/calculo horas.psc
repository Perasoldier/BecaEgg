//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//1 día = 24 horas = 1440 minutos = 86400 segundos



Algoritmo cantidadHoras
	Definir dias, horas , minutos, seg Como Entero
	
	Escribir "Escriba la cantidad de dias: "
	Leer dias
	
	horas = dias * 24
	minutos = horas * 60
	seg = minutos * 60
	
	Escribir "Las horas son: " , horas
	Escribir "los minutos son: " , minutos
	Escribir "Los segundos son: " , seg
	
FinAlgoritmo
