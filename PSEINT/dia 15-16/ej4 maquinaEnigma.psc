//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	
//	a e i o u
//	@ # $ % *
//	
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Algoritmo maquinaEnigma
	Definir frase,fraseCod como cadena
	fraseCod = ""
	Escribir "Por favor ingrese la frase que desea codificar"
	Leer frase
	codificar(frase,fraseCod)
	Escribir "La frase original es: " frase
	Escribir "La frase coficada es: " fraseCod
FinAlgoritmo

SubProceso codificar(frase, fraseCod por referencia)
	Definir i Como Entero
	frase = Minusculas(frase)
	Para i = 0 Hasta Longitud(frase)-1 Hacer
		Segun Subcadena(frase,i,i) Hacer
			"a":
				fraseCod = Concatenar(fraseCod, "@")
			"e":
				fraseCod = Concatenar(fraseCod, "#")
			"i":
				fraseCod = Concatenar(fraseCod, "$")
			"o":
				fraseCod = Concatenar(fraseCod, "%")
			"u":
				fraseCod = Concatenar(fraseCod, "*")
			De Otro Modo:
				fraseCod = Concatenar(fraseCod, Subcadena(frase,i,i))
		FinSegun
		
	FinPara
	
FinSubProceso
	