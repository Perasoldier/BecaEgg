//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
//	los números ingresados. Suponemos que el usuario no insertará número negativos.
Algoritmo numeros_
	Definir promedio, num, cantNum , total Como real
	cantNum = 0
	total = 0
	leer num
	Mientras num <> -1 Hacer
		Escribir "ingresar numero"
		Leer num
		cantNum = cantNum+1
		total = total+num
	Fin Mientras
	total=total
	cantNum= cantNum
	promedio = total/cantNum
	Escribir "Ingresaste -1"
	Escribir "ingresaste ",cantNum, " numeros el total es: ", total
	Escribir "El promedio es: ", promedio
	
FinAlgoritmo