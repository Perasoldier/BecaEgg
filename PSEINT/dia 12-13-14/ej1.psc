Funcion resultado <- suma ( x,z )
	Definir resultado Como Entero
	resultado = x+z
	
Fin Funcion



Algoritmo sin_titulo
//	Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//	calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
	
	Definir num1, num2 , resu_funcion Como Entero
	
	Escribir "Ingrese primer numero: "
	Leer num1
	Escribir "Ingrese segundo numero: "
	Leer num2
	resu_funcion = suma(num1,num2)
	
	Escribir "La suma de los dos numeros es: " , resu_funcion
FinAlgoritmo
