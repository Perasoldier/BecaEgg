//Un vendedor recibe un sueldo base m�s un 10% extra por comisi�n de sus ventas, el
//vendedor desea saber cu�nto dinero obtendr� por concepto de comisiones por las tres
//ventas que realiza en el mes y el total que recibir� en el mes tomando en cuenta su
//sueldo base y comisiones.

Algoritmo precios
	
	Definir sueldoBase, venta1, venta2, venta3, comision Como Real
	
	Escribir "Sueldo base es: "
	Leer sueldoBase
	
	Escribir "Ingrese monto venta 1"
	Leer venta1
	
	Escribir "Ingrese monto venta 2: "
	Leer venta2
	
	Escribir "Ingrese monto venta 3: "
	Leer venta3
	
	comision = (venta1+venta2+venta3) * 0.10
	
	Escribir "La comision de este mes fue de: " , comision
	
	Escribir "El sueldo mas comisiones es de: " , sueldoBase+comision
	
FinAlgoritmo
