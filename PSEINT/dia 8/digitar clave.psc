//7Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar una clave. 
//Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. 
//Si acertamos la clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema	correctamente.
Algoritmo ej8_1
	Definir clave, intento Como Caracter
	Definir cont Como Entero
	clave = "eureka"
	cont = 0
	Hacer 
		Escribir "Digita tu clave"
		Leer intento
		cont = cont + 1
		
	Mientras Que clave <> intento y cont < 3
	
	Si clave <> intento y cont >= 3
		Escribir "Has agotado los 3 intentos"
	FinSi
	
	Si clave == intento Entonces
		Escribir "Has ingresado al sistema correctamente"
	FinSi
FinAlgoritmo