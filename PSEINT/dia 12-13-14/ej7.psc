Funcion numeroEntero <- deCadenaAnumero ( nume )
	Definir numeroEntero Como Entero
	numeroEntero = ConvertirANumero(nume)
	
Fin Funcion


Algoritmo ej7
//	Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).
	
	definir num como cadena
	Hacer
		Escribir "Ingrese numero de hasta 3 cifras: "
		leer num
	Mientras que Longitud(num)>3
	
	Escribir "El numero cadena pasado a numerico es: " , deCadenaAnumero(num) 	
	
	Escribir  "El nuevo numero multiplicado x2 es: " , deCadenaAnumero(num)*2
	
FinAlgoritmo



