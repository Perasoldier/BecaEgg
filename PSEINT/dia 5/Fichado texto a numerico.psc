Algoritmo sin_titulo
//	Definir hora, minutos Como Real
//	
//	Escribir "Ingrese hora: "
//	leer hora
//	Escribir "Ingrese minutos: "
//	leer minutos
//	
//	Si hora == 19 y minutos <=15 Entonces
//		Escribir "Llegaste a tiempo"
//	SiNo
//		Escribir "Llegaste tarde, pone la alarma."
	//	Fin Si
	
	definir minutos, hora, hora2 Como Caracter
	definir num ,var1,var2 Como Entero
	Escribir "ingrese hora y minutos:"
	leer hora
	hora2 = Subcadena(hora, 0,1)
	
	minutos = Subcadena(hora, 3,4)
	
	
	var1 = ConvertirANumero(hora2)
	var2 = ConvertirANumero(minutos)
	
	Si var1 == 19 y var2 <=15 Entonces
			Escribir "Llegaste a tiempo"
		SiNo
			escribir "Llegaste tarde"
		FinSi
	
	
FinAlgoritmo
