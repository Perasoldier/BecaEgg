Algoritmo sin_titulo
	definir nota1,nota2, nota3 Como Entero
	definir var1 Como Logico
	
	Escribir "Ingrese nota 1: "
	Leer nota1
	Escribir "Ingrese nota 2: "
	Leer nota2
	Escribir "Ingrese nota 3: "
	Leer nota3
	
	Si (nota1 <= 10 Y nota1 >= 1) y (nota2 <= 10 Y nota2 >= 1) y (nota3 <= 10 Y nota3 >= 1) Entonces
		var1 = Verdadero
	SiNo
		var1 = Falso
		
	Fin Si
	
	Si var1== Verdadero 
		Escribir "Las notas son correctas"
	SiNo
		Escribir "Las notas son polemicas"
	Fin Si
	
	
FinAlgoritmo
