//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas

Algoritmo restasSucesivasRecursividad
	
	Definir numPrin, numDiv, cociente, resto Como Real
	Escribir "Plis dame el número principal y luego el número con el que lo quieres dividir:"
	Leer numPrin, numDiv
	Si numPrin<numDiv Entonces
		Escribir "Pon como número principal el número mayor, baby. ¡Plis!"
	SiNo
		cociente=0
		resta(numPrin, numDiv, cociente, resto)
		Escribir "El cociente es: " cociente " y el resto vendría siendo: " resto
	finsi
FinAlgoritmo

SubProceso resta(numPrin, numDiv, cociente por referencia, resto Por Referencia)
	Mientras numPrin >= numDiv Hacer
		cociente = cociente+1
		numPrin=numPrin-numDiv
	Fin Mientras
	resto=numPrin
FinSubProceso