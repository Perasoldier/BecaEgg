//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
//	los números ingresados. Suponemos que el usuario no insertará número negativos.
Algoritmo numeros_
	Definir promedio, num, cantNum , total Como real
	//inicializar todo para que rompa
	cantNum = 0
	total = 0
	num = 0
	
	Escribir "ingresar numero"
	Leer num
	
	si num <> -1 Entonces
		
		Mientras num <> -1 Hacer
			si num <> -1 Entonces
				cantNum = cantNum+1
				total = total+num
				Escribir "Al momento vas ingresando: ", cantNum, " numeros" 
				Escribir "ingresar un nuevo numero"
				Leer num
			FinSi
		Fin Mientras
		
		promedio = total/cantNum
		Escribir "Ingresaste -1"
		Escribir "ingresaste ",cantNum, " numeros, el total es: ", total
		Escribir "El promedio es: ", promedio
		
	SiNo
		Escribir "Ingresaste -1 al principio, sos boludo?"
	FinSi
	
FinAlgoritmo