// Construir un programa que simule un men� de opciones para realizar las cuatro
// operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
// num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
// car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
// ?M? o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.
Algoritmo sin_titulo
	Definir Num1,num2 Como Entero
	Definir oper Como Caracter
	Escribir 'Introduzca primer numero'
	Leer Num1
	Escribir 'Intruduzca segundo numero'
	Leer num2
	Escribir 'S/s : Suma'
	Escribir 'R/r : Resta'
	Escribir 'M/m : Multiplicacion'
	Escribir 'D/d : Division'
	Escribir 'Introduzca operacion'
	Leer oper
	oper <- Mayusculas(oper)
	Segun oper  Hacer
		'S':
			Escribir 'la suma es: ',Num1+num2
		'R':
			Escribir 'la resta es: ',Num1-num2
		'M':
			Escribir 'la multiplicacion es: ',Num1*num2
		'D':
			Escribir 'la division es: ',Num1/num2
		De Otro Modo:
			Escribir 'raja de aca'
	FinSegun
FinAlgoritmo
