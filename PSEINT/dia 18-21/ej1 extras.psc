//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo muestra_vectores
	definir vector1, vector2, n,i como enteros
	
	Dimension vector1[5]
	Dimension vector2[5]
	
	Para i=0 Hasta 4 hacer
		vector1[i]= azar(300)
		vector2[i]= azar(300)
		
		Escribir "Vector 1 posicion ",i+1 ," valor: ", vector1[i] 
		Escribir "Vector 2 posicion ",i+1 ," valor: ", vector2[i] 

	Fin Para
	
	
FinAlgoritmo
