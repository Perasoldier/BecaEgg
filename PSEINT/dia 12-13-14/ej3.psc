Funcion resultado <- EsMultiplo ( x, z )
	Definir resultado Como Logico
	
	resultado = x Mod z == 0
Fin Funcion


Algoritmo ejercicio3
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el primer numero"
	Leer num1
	Escribir "Ingrese el segundo numero"
	Leer num2
	
	Si EsMultiplo(num1, num2) Entonces
		Escribir "El segundo numero es multiplo del primero"
	SiNo
		Escribir "El segundo numero no es multiplo del primero"
	Fin Si
	
FinAlgoritmo