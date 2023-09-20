Funcion retorno <- Paridad (num)
	Definir retorno Como Logico
	retorno = num MOD 2 == 0
Fin Funcion


Algoritmo sin_titulo
	Definir Inventada Como Logico
	Definir numDePrueba Como Entero
	
	Escribir "Ingresar un numero"
	leer numDePrueba
	
	Escribir "Este es con el num ingresado por el usuario " Paridad(numDePrueba)
	
	Inventada = paridad(5)
	Escribir "Este es el primer ejemplo" Paridad(10)
	Escribir "Inventada es una variable logica que tiene asignado el valor: " Inventada 
	
FinAlgoritmo