Algoritmo sin_titulo
		Definir num, cantidadDigitos Como Entero
		
		Escribir "Ingrese un número entero:"
		Leer num
		
		cantidadDigitos = 0 // inicializamos la cantidad de digitos en 0
		Mientras num > 0 Hacer // si el num es mayor 0 entonces
			cantidadDigitos = cantidadDigitos + 1 // sumamos un digito
			num = trunc(num/ 10) // truncamos el numero dividido por 10, si el resultado es mayor a 0, lo volvemos a dividir y sigue sumando digitos
		FinMientras
		
		Escribir "El número tiene ", cantidadDigitos, " dígitos."
		
FinAlgoritmo
