
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.
//
Algoritmo sin_titulo
	definir rta Como Caracter	
	Definir longVector Como Entero
	
    Hacer
        Escribir "Ingrese el largo del vector"
        leer longVector
    Mientras Que longVector <= 0
	
	Hacer
	Escribir "Ingrese una opcion:"
	Escribir "A) Llenar vector A"
	Escribir "B) Llenar vector B"
	Escribir "C) Llenar vector C con suma de A y B"
	Escribir "D) Llenar vector C con resta de A y B"
	Escribir "E) Mostrar vector A, B o C"
	Escribir "F) Salir"
	leer rta
	rta=Mayusculas(rta)
Mientras Que rta<>"F"

Segun rta Hacer
	"A":
		llenarvectorA
	"B":
		secuencia_de_acciones_2
	"C":
		secuencia_de_acciones_3
	"D":
		secuencia_de_acciones_3
	"E":
		secuencia_de_acciones_3
	"F":
		secuencia_de_acciones_3
	De Otro Modo:
		secuencia_de_acciones_dom
Fin Segun


FinAlgoritmo

Funcion RespuestaA <- llenarvectorA(n)
	Definir vector, i Como Real
	Dimension vector[10]
	Definir RespuestaA como 
	
Fin Funcion



