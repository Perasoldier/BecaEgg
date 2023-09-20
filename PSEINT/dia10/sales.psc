Algoritmo sales
//
//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
