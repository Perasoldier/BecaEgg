Algoritmo sales
//
//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.ritmo sin_titulo
	
	Definir  i, k, sueldoBase, ventas , valorVenta, sumaVentas , cantVendedores Como Real
	Definir nombre Como Caracter
	
	Escribir "Ingrese cantidad de Vendedores: "
	Leer cantVendedores
	
	Para i=1 Hasta cantVendedores Hacer
		
		sumaVentas = 0
		valorVenta = 0
		Escribir "Ingresar nombre vendedor: "
		Leer nombre
		Escribir "Ingrese sueldo base del vendedor: "
		Leer sueldoBase
		Escribir "Ingrese cantidad de ventas: "
		leer ventas
		
		Para k = 1 Hasta ventas
			Escribir "Ingrese monto de venta ",k " :"
			Leer valorVenta
			sumaVentas = sumaVentas + valorVenta
		FinPara
		Escribir "Vendedor de nombre: " , nombre
		Escribir "Dinero a pagar por comisiones semanales: $" , sumaVentas * 0.1 
		Escribir "Total a pagar (Sueldo + Comisiones: $" , sueldoBase + (sumaVentas*0.1)
		
	
	Fin Para


	
	
FinAlgoritmo
