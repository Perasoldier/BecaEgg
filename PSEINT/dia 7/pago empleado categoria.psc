//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo
//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
//		b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//			como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//			del valor de venta total.
//			c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga
//				por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
//				40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor
//				de la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que
//					tiene un empleado.
Algoritmo pago_sueldo
	Definir tipo Como Caracter
	definir money, valorH, horas,horasExt Como Real
	Escribir "Introduzca metodo pago:"
	Escribir "A: Solo comision"
	Escribir "B: Fijo + comision"
	escribir "C: Fijo"
	
	Leer tipo
	tipo =Mayusculas(tipo)
	Segun tipo Hacer
		"A":
			Escribir "Ingresar valor total de todas las ventas del mes: "
			Leer money
			Escribir "Las comisiones de este mes son: " , money * 0.4
		"B":
			Escribir "Ingresar valor hora : "
			leer valorH 
			Escribir "Ingresar cantidad de horas trabajadas: "
			Leer horas
				Si horas > 40 Entonces
				horas = 40
			Fin Si
			Escribir "Ingresar ventas totales del mes: "
			leer money
			Escribir "Se va pagar " horas " horas y comisiones por $" money
			Escribir "El total es: " (horas * valorH) + (money * 0.25) 
		"C":
			Escribir "Ingresar valor hora : "
			leer valorH 
			Escribir "Ingresar cantidad de horas trabajadas: "
			Leer horas
			Si horas > 40 Entonces
				horasExt = horas-40
				Escribir "Se van a pagar: ",horas-horasExt  " horas normales y ",horasExt," horas extra"
				Escribir "El total del mes es: ", (horas*valorH) + (horasExt* (valorH*1.5))
			SiNo
				Escribir "Se van a pagar " horas " horas"
				Escribir "El total del mes es: " horas*valorH
			
				Fin Si
		De Otro Modo:
			Escribir "No es un empleado"
	Fin Segun
	
	
	
	
//	
//	Si tipo == "A" Entonces
//		Escribir "ingresar valor total de todas las ventas del mes: "
//		Leer money
//		Escribir "Las comisiones de este mes son: " , money * 0.4
//		
//	SiNo
//		Si tipo == "B" Entonces
//			Escribir "Ingresar valor hora : "
//			leer valorH 
//			Escribir "Ingresar cantidad de horas trabajadas: "
//			Leer horas
//			Escribir "Se va pagar
//			
//			
//		SiNo
//			Escribir "Ingresar valor hora : "
//			
//		Fin Si
//	Fin Si
//	
	
	
FinAlgoritmo
