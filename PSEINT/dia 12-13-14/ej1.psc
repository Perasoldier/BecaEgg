Funcion resultado <- suma ( x,z )
	Definir resultado Como Entero
	resultado = x+z
	
Fin Funcion



Algoritmo sin_titulo
//	Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//	pediremos al usuario los dos números para pasárselos a la función. Después la función
//	calculará la suma y lo devolverá para imprimirlo en el algoritmo.
	
	Definir num1, num2 , resu_funcion Como Entero
	
	Escribir "Ingrese primer numero: "
	Leer num1
	Escribir "Ingrese segundo numero: "
	Leer num2
	resu_funcion = suma(num1,num2)
	
	Escribir "La suma de los dos numeros es: " , resu_funcion
FinAlgoritmo
