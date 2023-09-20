/Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a
//continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1o) El programa elige al azar un n�mero n entre 1 y 10.
//	2o) El usuario ingresa un n�mero x.
//	3o) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o
//			que el n�mero ingresado.
//			4o) Repetimos desde 2) hasta que x sea igual a n.
//			El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu�
//				hacer y qu� pas� hasta que adivine el n�mero.


Algoritmo juegodenumerosej7dia8
	//Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10
	Definir num_secreto, num_ingresado Como Entero 
	num_secreto<- Aleatorio(1,10)
	
	//continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
	//	1o) El programa elige al azar un n�mero n entre 1 y 10.
	
	
	Hacer  
		Escribir "Adivine el numero secreto que se encuentra entre de 1 a 10: "
		Leer num_ingresado
		si num_secreto>num_ingresado Entonces
			Escribir " muy bajo "
		FinSi
		Si num_secreto<num_ingresado Entonces
			Escribir "muy alto"
		FinSi
		
	Mientras Que num_secreto<>num_ingresado 
	
	Escribir "Acertaste"
	
    
FinAlgoritmo