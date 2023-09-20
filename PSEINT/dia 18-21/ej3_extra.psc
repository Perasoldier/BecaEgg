//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
Algoritmo ej3_extra
	
	Definir vectorNombres Como cadena
	Definir vectorLongitud,i ,k, n como entero
	Escribir "Elije una cantidad de nombres a guardar: "
	leer n
	Dimension vectorNombres[n]
	dimension vectorLongitud[n]
	
	para i=0 hasta n-1
		Escribir "Ingrese ", i+1, " nombre: "
		leer vectorNombres[i]
		vectorLongitud[i]=longitud(vectorNombres[i])
	FinPara
	
	Para k=0 Hasta n-1 hacer
		escribir "1: ", vectorNombres[k] , " tiene una longitud de ", vectorLongitud[k], " caracteres"
	Fin Para
	
	
	finAlgoritmo
