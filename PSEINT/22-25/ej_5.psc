//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
Algoritmo ej_5
	definir matriz, palabra Como Caracter
	Definir i,j Como Entero
	Hacer
		Escribir "Ingrese una palabra de 9 caracteres unicamente:"
		leer palabra
	Mientras Que Longitud(palabra)<>9
	
	dimension matriz[3,3]
	
	para i<-0 hasta 2 Hacer
		si i=0 Entonces
			para j<-0 hasta 2 Hacer
				matriz[i,j]=Subcadena(palabra,j,j)
			FinPara
		FinSi
		si i=1 Entonces
			para j<-0 hasta 2 Hacer
				matriz[i,j]=Subcadena(palabra,j+3,j+3)
			FinPara
			
		FinSi
		si i=2 Entonces
			para j<-0 hasta 2 Hacer
				matriz[i,j]=Subcadena(palabra,j+6,j+6)
			FinPara
			
		FinSi
	FinPara
	
	Para i = 0 Hasta 2 Hacer
		para j = 0 hasta 2 Hacer
			Escribir sin saltar matriz[i,j] "   "
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
