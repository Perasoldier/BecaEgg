Algoritmo sin_titulo
//	Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//		máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
//		nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra
	//			cuenta.
//Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//		verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
	//				correcta haremos que una variable llamada Login sea verdadera.
	
	
	definir user, pass Como Caracter
	definir login Como Logico
	Definir intento, menu , botellas , saldo, peso ,i,j,k Como Entero
	saldo=0
	login = Falso
	intento = 1
	Escribir "Ingrese ususario "
	Leer user
	si user == "Albus_D"
		mientras (login == Falso) y (intento <= 3)
			Escribir "Ingrese contraseña"
			Leer pass
			intento = intento + 1
			si pass== "caramelosdelimon"
				login=Verdadero
				Escribir "Usuario y contraseña correctos!"
			FinSi
			
		FinMientras
		
		
		SiNo
			Escribir "usuario incorrecto"
		FinSi
	si login == Verdadero
			hacer 
				Escribir "1) Ingresar botellas"
				Escribir "2) consultar saldo"
				Escribir "3) Salir"
				
				Leer menu
				
				Segun menu Hacer
					1:
						Escribir "ingrese cantidad de botellas"
						leer botellas
						Para i=1 Hasta botellas Hacer
							peso=aleatorio(100,3000)
							si peso<=500
								saldo= saldo+50
							SiNo
								Si peso>500 y peso<=1500
								 saldo= saldo + 125
							 
							 FinSi
							
							FinSi
							
						Fin Para
					opcion_2:
						secuencia_de_acciones_2
					opcion_3:
						secuencia_de_acciones_3
					De Otro Modo:
						secuencia_de_acciones_dom
				Fin Segun
				
			
			Mientras Que login == verdadero 
	FinSi
	
		
	
FinAlgoritmo
