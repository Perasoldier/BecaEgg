Algoritmo ejercicio2
	Definir lado, i, j Como Entero
	
	//Defino el tamaño del cuadrado
	Escribir "Ingrese longitud de lado del cuadrado"
	Leer lado
	
	//Dibujo el cuadrado
	Para i = 1 Hasta lado //recorre a lo alto, osea fila por fila empezando desde arriba
		
		Si i == 1 O i == lado Entonces //Primera o última fila son de todos asteriscos
			Para j = 1 hasta lado - 1
				Escribir Sin Saltar "*"
			FinPara
			Escribir "*"  //Sin saltar, es el caso límite, para que la siguiente fila empiece abajo
		SiNo
			Para j = 1 Hasta lado
				Si j == 1 Entonces
					Escribir Sin Saltar "*"
				SiNo
					Si j == lado Entonces
						Escribir "*"  //es el caso límite
					Sino 
						Escribir Sin Saltar" "
					FinSi
				FinSi
			FinPara
		FinSi
	FinPara
FinAlgoritmo
