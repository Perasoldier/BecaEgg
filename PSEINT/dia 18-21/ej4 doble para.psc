//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20
Algoritmo notas_alumnos
	Definir alumnos, i, deficientes, regulares, buenos, excelentes Como Entero
	deficientes=0
	regulares=0
	buenos=0
	excelentes=0
	Dimension alumnos[100]
	
	para i=0 hasta 99 Hacer
		alumnos[i]=Aleatorio(0,20)
		Escribir "La nota del alumno ", i+1, " es: ", alumnos[i]
	FinPara
	
	Para i=0 Hasta 99 Hacer
		si alumnos[i]<=5 Entonces
			deficientes = deficientes+1
		SiNo
			si alumnos[i]>=6 y alumnos[i]<=10 Entonces
				regulares=regulares+1
			SiNo
				si alumnos[i]>=11 y alumnos[i]<=15 Entonces
					buenos=buenos+1
				SiNo
					si alumnos[i]>=16 y alumnos[i]<=20 Entonces
						excelentes=excelentes+1
					FinSi
				FinSi
			FinSi
		FinSi

	Fin Para
	
	
	Escribir "los alumnos deficientes son: ", deficientes
	Escribir "los alumnos regularesson: ", regulares
	Escribir "los alumnos buenos son: ", buenos
	Escribir "los alumnos excelentes son: ", excelentes
	
	
	
FinAlgoritmo

//si alumnos[i]<=5 Entonces
//	deficientes = deficientes+1
//SiNo
//	si alumnos[i]>=6 y alumnos[i]<=10 Entonces
//		regulares=regulares+1
//	SiNo
//		si alumnos[i]>=11 y alumnos[i]<=15 Entonces
//			buenos=buenos+1
//		SiNo
//			si alumnos[i]>=16 y alumnos[i]<=20 Entonces
//				excelentes=excelentes+1
//			FinSi
//		FinSi
//	FinSi
//FinSi
