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

//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//		Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.


Algoritmo ej_11
	Definir num Como Entero
	Escribir "Ingresar numero"	
	Leer num
	
	Escribir "Los numeros son todos impares: " , impar(num)
	
	
FinAlgoritmo
