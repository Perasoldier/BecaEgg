//3. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo ejercicio3
	definir vector, n, i, numBuscar, respuesta Como Entero
	
	escribir "Decime cuanto espacio queres pi"
	leer n
	Dimension vector(n)
	
	para i<- 0 hasta n-1 Hacer
		Escribir "Decime el valor de: " i+1
		leer vector(i)
	FinPara
	
	escribir "Decime el n�mero que queres buscar"
	leer numBuscar
	
	para i<-0 hasta n-1 Hacer
		si vector(i)=numBuscar Entonces
			escribir sin saltar i+1 " " 
		FinSi
	FinPara
	
FinAlgoritmo