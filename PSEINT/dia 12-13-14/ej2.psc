Funcion retorno <- par ( x )
	definir retorno Como Logico
	retorno = x mod 2 <> 0
	
Fin Funcion

Algoritmo sin_titulo
	
//	Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//	devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//	mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
	
	Definir num Como Entero
	
	Escribir "Ingrese numero: "
	leer num
	
si par(num)
	Escribir "El numero es impar."
	SiNo
	Escribir "El numero es par."
FinSi

FinAlgoritmo
