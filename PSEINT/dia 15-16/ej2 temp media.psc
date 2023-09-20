//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.


Algoritmo tempMedia
	Definir tempMin, tempMax, nDias, tempMed, i Como numerico
	Escribir "Por favor el número de días que quiere evaluar"
	Leer nDias
	Para i = 1 hasta nDias Hacer
		Escribir "Por favor ingrese la temperatura máxima registrada durante el día " i
		Leer tempMax
		Escribir "Por favor ingrese la temperatura mínima registrada durante el día " i
		Leer tempMin
		mediaTemp(tempMax, tempMin, tempMed)
		Escribir "La temperatura media para del  día " i " es " tempMed		
	FinPara
	
	
	
FinAlgoritmo

SubProceso mediaTemp (max, min, tempMed Por Referencia)
	
	tempMed = (max+min)/2
	
FinSubProceso