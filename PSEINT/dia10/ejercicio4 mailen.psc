Algoritmo ejercicio4
	Definir n, i, factor Como Entero
	Definir factorial, parteFactorial Como Caracter
	
	n = 5
	factor = 1
	
	factorial = "1"
	Escribir "1! = ", factorial
	
	Para i = 2 hasta n
		factor = factor * i
		parteFactorial = ConvertirATexto(i) //el nuevo n�mero que se agrega
		factorial = Concatenar(factorial,"*") //el nuevo n�mero *
		factorial = Concatenar(factorial,parteFactorial)
		Escribir i, "! = ", factorial, " = ", factor
	FinPara
FinAlgoritmo
