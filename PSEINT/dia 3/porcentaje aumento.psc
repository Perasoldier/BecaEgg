//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.


Algoritmo precios
		Definir precioI Como entero
		mostrar "ingresar precio inicial"
		leer precioI
		Definir precioF Como entero
		mostrar "ingresar precio final"
		leer precioF
		Definir porcentajeDeAumento como real
		Definir aumento Como real
		aumento= precioF-precioI
		porcentajeDeAumento= (aumento/precioI) *100
		mostrar "el porcentaje de aumento es: " porcentajeDeAumento
	
	
FinAlgoritmo
