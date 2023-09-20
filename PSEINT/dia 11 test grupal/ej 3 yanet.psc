Algoritmo sin_titulo
	Definir usuario, contrasenia, menu, confirmar como cadena
	Definir login Como Logico
	Definir intentos, botellas, i, grs, pesos, saldo Como Entero
	intentos = 1
	saldo = 0
	
	Escribir "Ingrese su nombre de usuario"
	Leer usuario
	si usuario <> "Albus_D" Entonces
		Escribir "Usuario incorrecto"
	SiNo
		Escribir "Ingrese su contraseña"
		Leer contrasenia
		login = contrasenia == "caramelosDeLimon"
		Mientras login == Falso Y intentos < 3 Hacer
			intentos = intentos + 1
			Escribir "Ingrese nuevamente su contraseña"
			leer contrasenia
		FinMientras
		si login Entonces
			repetir
				Escribir "Presione: 1 para ingresar botellas. 2 para consultar saldo o 3 para salir"
				Leer menu
				si menu <> "1" Y menu <> "2" Y menu <> "3" Entonces
					Escribir "Opción inválida"
				SiNo
					si menu = "1" Entonces
						Escribir "Escriba la cantidad de botellas que desea ingresar"
						leer botellas
						Para i = 1 Hasta botellas Hacer
							grs = Aleatorio(100, 300)
							si grs > 1501 Entonces
								pesos = 200
								saldo = saldo + pesos
							SiNo
								si grs >= 501 Y grs <= 1500 Entonces
									pesos = 125
									saldo = saldo + pesos
								SiNo
									pesos = 50
									saldo = saldo + pesos
								FinSi
							FinSi
						FinPara
						Escribir "El valor ofrecido por las botellas ingresadas es: $", saldo, ". Pulse cualquier tecla para continuar. Para cancelar la venta marque N"
						leer confirmar
						si Mayusculas(confirmar) <> "N" Entonces
							Escribir "Su saldo fue acreditado"
						SiNo
							Escribir "Devolviendo el material"
							
						FinSi
						
					SiNo
						si menu = "2" Entonces
							Escribir "Su saldo es de $: ", saldo
						FinSi
					FinSi
				FinSi
			Mientras Que menu <> "3"
		FinSi
		
	FinSi
FinAlgoritmo
