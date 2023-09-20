//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//50 ? 13 = 37 una resta realizada
//37 ? 13 = 24 dos restas realizadas
//24 ? 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.


Algoritmo restaSuc
	
	Definir dividendo, divisor, cociente, residuo como numerico
	cociente = 0	
	Escribir "Por favor ingrese el dividendo"
	Leer dividendo
	Escribir "Por favor ingrese el divisor"
	Leer divisor	
	restaSucesiva(dividendo, divisor, cociente, residuo)
	Escribir "El resultado de la división por resta sucesiva de " dividendo "/" divisor " es: " cociente " para el cociente y " residuo " para el residuo"
	Escribir cociente
	
FinAlgoritmo


SubProceso restaSucesiva(dividendo, divisor, cociente Por Referencia, residuo Por Referencia)
	
	Si dividendo > divisor Entonces		
		dividendo = dividendo - divisor
		cociente = 	cociente + 1
		restaSucesiva(dividendo, divisor, cociente, residuo)
	SiNo
		residuo = dividendo
	FinSi
	
FinSubProceso