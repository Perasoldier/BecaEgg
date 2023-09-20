//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el
//	algoritmo. Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo siete
	Definir array1, array2 , n como entero
	
	Escribir "Ingrese una longitud para el vector"
	Leer n
	
	Dimension array1[n]
	Dimension array2[n]
	
	rellenar(array1,n)
	Escribir "   "
	rellenar(array2,n)
	
	//Escribir sonIguales(array1,array2,n)
	
	si (sonIguales(array1,array2,n)) Entonces
		Escribir "Los elementos del vector son todos iguales"
	SiNo
		Escribir "Los elementos del vector no son iguales"
	FinSi
FinAlgoritmo

SubProceso rellenar(vector Por Referencia, n)
	Definir i Como Entero
	Para i=0 Hasta n -1 Hacer
		vector[i] = Aleatorio(1,10)
		Escribir "en el indice " i " el valor es " vector[i]
	Fin Para
FinSubProceso

funcion igualitos = sonIguales(vector1,vector2,n)
	Definir i Como Entero
	Definir igualitos Como Logico
	Para i=0 Hasta n -1 Hacer
		igualitos = (vector1[i] == vector2[i])
		//Escribir "en el indice " i " el valor es " igualitos
	FinPara
	
FinFuncion
	