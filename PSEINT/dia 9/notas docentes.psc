Algoritmo sin_titulo
	//	Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
	//	N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
	//	Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
	//	de sus estudiantes:
	//	- Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
	//	reprueba el curso si tiene una nota final inferior a 6.5
	//	- Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
	//	- La mayor nota obtenida en las exposiciones.
	//	- Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
	//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
	//		las 3 notas y calculará todos informes claves que requiere el docente
	
	Definir nota1, nota2, nota3, notaFinal, promedioReprobados, porcentaje75, mayorExposiciones, sumaNotas Como real
	Definir estudiantes, estudiantesParcial, estudiantesReprobados, estudiantes75, contador Como Entero
	
	Hacer
		Escribir "Ingrese la cantidad de estudiantes para evaluar los informes"
		leer estudiantes
	Mientras Que estudiantes<=0
	
	estudiantesReprobados=0
	promedioReprobados=0
	mayorExposiciones=0
	estudiantesParcial=0
	estudiantes75=0
	Para contador<-1 Hasta estudiantes Hacer
		notaFinal=0
		
		Escribir "Dame la nota del trabajo práctico del estudiante ", contador
		leer nota1
		Escribir "Dame la nota de la exposición del estudiante ", contador
		leer nota2
		Escribir "Dame la nota del parcial del estudiante ", contador
		leer nota3
		//sumaNotas=nota1+nota2+nota3
		
		si nota2>=mayorExposiciones Entonces
			mayorExposiciones=nota2
		FinSi
		
		notaFinal=(nota1*0.35+nota2*0.25+nota3*0.40)
		//Escribir notaFinal
		si notaFinal<6.5 Entonces
			estudiantesReprobados=estudiantesReprobados+1
			promedioReprobados=promedioReprobados+notaFinal
		FinSi
		
		si nota1>=7.5 Entonces
			estudiantes75=estudiantes75+1			
		FinSi
		
		si nota3>=4.0 y nota3<=7.5 Entonces
			estudiantesParcial=estudiantesParcial+1
		FinSi
	Fin Para
	Escribir "Este es el promedio de estudiantes reprobados: ",promedioReprobados/estudiantesReprobados
	Escribir "El porcentaje de estudiantes que superan 7.5 en la nota integrador es: ",(estudiantes75*100)/estudiantes, "%"
	Escribir "La mayor nota de exposiciones en el curso es de: ", mayorExposiciones
	Escribir "La cantidad de estudiantes con notas del parcial entre 4.0 y 7.5 es: ", estudiantesParcial
	
	
FinAlgoritmo