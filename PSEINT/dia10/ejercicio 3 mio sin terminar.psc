Algoritmo sin_titulo
    //	Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
    //	invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
	//	deberá mostrar:
	
	Definir i, alto, maxAlto Como Entero
	
	Escribir "Ingrese alto:"
	Leer alto
	maxAlto=alto
	 Para i = alto Hasta 1 Con Paso -1 Hacer
		
		si i == maxAlto
			Para i = maxAlto Hasta 2 Con Paso -1
				Escribir Sin Saltar " * "
			FinPara
			Escribir " *"
		FinSi
		
		alto= alto-1
		
		Si i < alto
			para i = alto Hasta 1 Con Paso -1
				Escribir sin saltar " * "
			Fin Para
			Escribir " "
		FinSi
		
	FinPara
	
FinAlgoritmo
