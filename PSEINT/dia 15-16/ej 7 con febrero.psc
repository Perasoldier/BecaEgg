//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//		representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//		asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
//			los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.



Algoritmo sin_titulo
	
	Definir dia,mes,anio Como Entero
	Escribir "Ingrese un dia, un mes y un año (Formato numerico)"
	Leer dia,mes,anio
	
	fecha(dia,mes,anio)
	
FinAlgoritmo



SubProceso fecha(dia,mes,anio)
	
	si dia>1 y dia<=31 Entonces
		Escribir dia-1, "/", mes, "/", anio
		
	SiNo
		Si mes==1 y dia==1 Entonces
			Escribir 31 "/", 12, "/", anio-1
			
		SiNo
			
			
			si (mes == 4 o mes == 6 o mes == 9 o mes == 11) entonces
				Escribir  30 "/", mes-1, "/", anio
			sino si (mes==3 y dia==1) Entonces
					Escribir 28 "/", mes-1, "/", anio
				SiNo
					Escribir  31 "/", mes-1, "/", anio
					
				FinSi
			FinSi
			
			
		FinSi
		
		
	FinSi
	
	
FinSubProceso