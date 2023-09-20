Algoritmo EjercicioDesayuno
	Definir respuesta , respuesta2  , respuesta3 como caracter	
	escribir " ¿Quieres tomar café o té?"
	leer respuesta 
	respuesta = Minusculas(respuesta)
	si respuesta == "te" Entonces
		escribir "Se le servira té"
	SiNo
		si respuesta == "cafe" Entonces
			escribir "¿solo o cortado?"
			leer respuesta2
			si respuesta2 == "cortado" Entonces
				escribir "¿prefiere leche vegetal?"
				leer respuesta3
				si respuesta3 == "si" Entonces
					escribir "Se servira café cortado con leche vegetal"
				SiNo
					Escribir "se servirá café cortado con leche normal"
					
					
					
				FinSi
			SiNo
				escribir "Se servira café solo"
			FinSi
		Finsi
	FinSi
	
FinAlgoritmo
