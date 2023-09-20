Algoritmo sin_titulo
	
	Definir dia,mes,anio Como Entero
	Escribir "Ingrese un dia, un mes y un año (Formato numerico)"
	Leer dia,mes,anio
	
	fecha(dia,mes,anio)
	
FinAlgoritmo



SubProceso fecha(dia,mes,anio)
	
	si dia > 1 y dia <= 31 Entonces
		Escribir dia-1,"/",mes,"/",anio
	SiNo
		si mes == 1 entonces
			Escribir  31 "/", mes+11, "/", anio-1
		sino 
			si (mes == 4 o mes == 6 o mes == 9 o mes == 11) entonces
				Escribir  30 "/", mes-1, "/", anio
			sino
				Escribir  31 "/", mes-1, "/", anio
			FinSi
			
		FinSi
	FinSi
	
FinSubProceso