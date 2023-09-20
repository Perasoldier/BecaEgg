Algoritmo sin_titulo
	Definir num, cifra1,cifra2 Como Entero
	Escribir "ingrese numero de 3 cifras"
	Leer num
	cifra1<- trunc(num/100)
	cifra2<- (num mod 10) 
	
	si cifra1==cifra2 Entonces
		Escribir "es capicua"
	SiNo
		Escribir "no es capicua"
		
	FinSi
FinAlgoritmo
