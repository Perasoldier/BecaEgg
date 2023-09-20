// Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
// ?M? o ?m? para la multiplicación y ?D? o ?d? para la división.
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
