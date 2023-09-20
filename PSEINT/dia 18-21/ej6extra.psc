
//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo sin_titulo
	definir vector,n,i,min,max como entero
	Escribir "Ingrese dimension de vector: "
	Leer n
	dimension vector[n]
	
	Para i=0 Hasta n-1 Hacer
		vector[i]=Aleatorio(0,100)
		Escribir "vector n: ", vector[i]
	Fin Para
	
	escribir diferencia(vector,n,x)
	
	
FinAlgoritmo

Funcion numerofinal<-diferencia(vector,n, x Por Referencia)
	definir numerofinal,i,max,min Como Entero
	max=vector[0]
	min=vector[0]
	Para i=1 Hasta n-1 Hacer
		si vector[i]>max Entonces
			max=vector[i]			
		FinSi
		si vector[i]<min Entonces
			min=vector[i]
		FinSi
	Fin Para
	numerofinal= max-min
	Escribir "El numero maximo fue: ", max
	Escribir "El numero minimo fue: ", min
	Escribir Sin Saltar "La diferencia fue: "
Fin Funcion
