Algoritmo cambioVariable
//	Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
	//	La variable A, debe terminar con el valor de la variable B.
	Definir var1, var2, aux Como Caracter
	
	Escribir "Ingrese dos variables: "
	Leer var1,var2
	
	Escribir "Variable 1: ", var1
	Escribir "variable 2: " , var2
	intercambio(var1, var2, aux)
	Escribir "Luego del intercambio: "
	
	Escribir "Variable 1: ", var1
	Escribir "variable 2: " , var2
	
FinAlgoritmo

SubProceso intercambio(var1 Por Referencia, var2 Por Referencia, aux Por Referencia)
	aux=var1
	var1=var2
	var2=aux	
FinSubProceso

