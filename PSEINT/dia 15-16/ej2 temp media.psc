//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.


Algoritmo tempMedia
	Definir tempMin, tempMax, nDias, tempMed, i Como numerico
	Escribir "Por favor el n�mero de d�as que quiere evaluar"
	Leer nDias
	Para i = 1 hasta nDias Hacer
		Escribir "Por favor ingrese la temperatura m�xima registrada durante el d�a " i
		Leer tempMax
		Escribir "Por favor ingrese la temperatura m�nima registrada durante el d�a " i
		Leer tempMin
		mediaTemp(tempMax, tempMin, tempMed)
		Escribir "La temperatura media para del  d�a " i " es " tempMed		
	FinPara
	
	
	
FinAlgoritmo

SubProceso mediaTemp (max, min, tempMed Por Referencia)
	
	tempMed = (max+min)/2
	
FinSubProceso