Algoritmo sin_titulo
	Definir n1,n2 Como Entero
	Definir respuesta Como Caracter
	Escribir 'Ingrese dos numeros enteros'
	Leer n1,n2
	Escribir 'Ingrese la inicial de la operacion matematica a realizar'
	Leer respuesta
	respuesta <- Minusculas(respuesta)
	Segun respuesta  Hacer
		's':
			Escribir 'La respuesta es:',n1+n2
		'r':
			Escribir 'La respuesta es:',n1-n2
		'm':
			Escribir 'La respuesta es:',n1*n2
		{expresion}:
		'd':
			Escribir 'La respuesta es:',n1/n2
		De Otro Modo:
			Escribir 'Eso no lo hago'
	FinSegun
FinAlgoritmo
