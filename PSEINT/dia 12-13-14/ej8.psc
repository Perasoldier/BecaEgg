Funcion credenciales <- login ( user, pass)
	Definir credenciales Como Logico
	definir i Como Entero
	
	Para i=1 Hasta 3 Hacer
		Escribir "Ingrese usuario: "
		leer user
		Escribir "Ingrese contrase�a: "
		leer pass
		si user == "usuario1" Y pass == "asdasd"
			i=3
			credenciales = Verdadero
		FinSi
		si user <> "usuario1" o pass <> "asdasd"
			Escribir "El usuario o Contrase�a ingresados son incorrectos."
			Escribir "Intentos fallidos: " , i
		FinSi
	Fin Para
	
	
Fin Funcion

//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd".
//		Adem�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.


Algoritmo ej8
	Definir usuario , contrasenia Como Caracter
	Definir resultado Como Logico
	usuario = ""
	contrasenia =""
	Escribir "Bienvenidos al aula virtual"
	
	resultado = login(usuario,contrasenia)
	
	si resultado 
		Escribir "Iniciaste sesion correctamente"
	SiNo
		Escribir "Fallaste los 3 intentos, su cuenta se bloqueo permanentemente :�(  ."
	FinSi
	
	
	
	
	
FinAlgoritmo
