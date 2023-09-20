Algoritmo ej_1
	definir num, contador,i Como Entero
	contador<-0
	Hacer
		
		Escribir "ingrese un numero entero del 1 al 20"
		leer num
		Mientras num<1 o num>20 Hacer
			
			Escribir "ingrese un numero valido entre el 1 y el 20"
			leer num
			
		FinMientras
		
		contador = contador +1
		//revisar la condicion del numero
		Escribir sin saltar num
		para i<-1 hasta num con paso 1 Hacer
			Escribir sin saltar " *"
		FinPara
		Escribir ""
	Mientras Que contador<5
	
	
	
FinAlgoritmo