Algoritmo ej2
	Definir vector, largo, numBuscado Como Entero 
	Definir indices Como Caracter
	indices = ""
	
	Escribir Sin Saltar "Ingrese tamaño del vector: "
	leer largo
	validarMayor(largo, 1)
	
	Dimension vector[largo]
	llenarVector(vector, largo)
	
	Escribir "Ingrese numero a buscar:"
	leer numBuscado 
	
	indices = buscarIndice(vector, largo, numBuscado)
	
	segun Longitud(indices) Hacer
		0: Escribir "No se encontró el número " numBuscado " en el vector."
		1: Escribir "El num " numBuscado " se encontró en el subindice " indices 
		De Otro Modo:
			Escribir "El num " numBuscado " se encontró en los subindices " indices	
	FinSegun
FinAlgoritmo

SubProceso validarMayor(num Por Referencia, min)
	Mientras num < min Hacer
		Escribir "Ingrese un mayor o igual " min 
		leer num
	FinMientras
FinSubProceso

SubProceso llenarVector(vec Por Referencia, largo)
	Definir i, num Como Entero
	Para i = 0 Hasta largo-1 Hacer
		Escribir "Ingrese un numero para indice " i ":"
		Leer num
		vec[i] = num
	Fin Para
FinSubProceso

Funcion indices <- buscarIndice(vec, largo, num)
	Definir indices Como Caracter
	Definir i Como Entero
	indices = ""
	para i = 0 hasta largo-1 Hacer
		si vec[i] = num Entonces
			indices = Concatenar(indices, Concatenar(ConvertirATexto(i), ", "))
		FinSi
	FinPara
	indices = Subcadena(indices, 0, Longitud(indices)-3)
FinFuncion