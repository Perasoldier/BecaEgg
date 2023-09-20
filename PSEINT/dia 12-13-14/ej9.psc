//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//  debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//	festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.
Funcion salario <- calculoHoras ( horas,dia,turno, feriado)
	Definir salario, diurno,nocturno Como Real
	diurno = 90
	nocturno = 125
	
	si turno == "diurno"
		si feriado == verdadero
			salario = horas * (diurno * 1.1)
		SiNo
			salario = horas * diurno
		FinSi
		
	FinSi
	si turno == "nocturno" 
		si feriado == verdadero
			salario = horas * (nocturno * 1.15)
		sino
			salario = horas * nocturno
		FinSi
	FinSi
	
Fin Funcion

Algoritmo sin_titulo

	
	Definir nombre, dia, turno, fer Como Caracter
	definir horas Como entero
	Definir feriado Como Logico
	
	
	Escribir "Ingrese nombre del Empleado: "
	Leer nombre
	Escribir "Ingrese dia de la semana: "
	leer dia
	Escribir "Fue feriado: "
	leer fer
	si fer == "si" o fer == "y"
		feriado = Verdadero
	SiNo
		feriado = Falso
	FinSi
	Escribir "Ingrese turno: "
	Leer turno
	Escribir "Ingrese cantidad de horas trabajadas: "
	Leer horas
	
	Escribir " El salario es: ", calculoHoras(horas, dia, turno, feriado)
	
	
	
	
	
	
FinAlgoritmo




