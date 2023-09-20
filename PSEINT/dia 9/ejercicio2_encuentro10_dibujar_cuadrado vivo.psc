//Dejo por aca en vez del con el si-sino con uno O
		Algoritmo ejercicio2_encuentro10_dibujar_cuadrado
			Definir lado, i, j Como Entero
			lado =0
			i=0
			j=0
			Escribir "Ingrese el tamaño del cuadrado:"
			Leer lado
			
			Para i=1 hasta lado hacer
				Para j=1 hasta lado hacer
					Si i=1 o i=lado o j=1 o j=lado entonces
						Escribir Sin Saltar"*"
					Sino
						Escribir sin saltar " "
					FinSi
				FinPara
				Escribir ""
			FinPara
FinAlgoritmo