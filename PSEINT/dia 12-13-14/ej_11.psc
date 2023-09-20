Funcion res <- impar ( num )
	definir res Como Logico
	res = Verdadero
	
	mientras res Y num > 0 Hacer
			
		si num mod 2 == 0
			res = Falso
		FinSi
		num = trunc(num / 10)
		
	FinMientras
	
	
Fin Funcion

//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//		Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.


Algoritmo ej_11
	Definir num Como Entero
	Escribir "Ingresar numero"	
	Leer num
	
	Escribir "Los numeros son todos impares: " , impar(num)
	
	
FinAlgoritmo
