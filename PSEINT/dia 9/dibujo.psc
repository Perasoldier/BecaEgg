Algoritmo sin_titulo
//	Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
//	un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
	//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	
	
	// ****
	// *  *
	// *  *
	// ****
	
	Definir i,k,ancho Como Entero
	Escribir "Ingrese numero: "
	Leer ancho
	
	Para i=1 Hasta ancho hacer
		si i==1 O i==ancho
			para k = 1 Hasta ancho-1 Hacer
				Escribir Sin Saltar "*"
			FinPara
			Escribir "*"
		SiNo
			para k = 1 hasta ancho
				si k==1 Entonces
					Escribir Sin Saltar "*"
				SiNo
					si k== ancho Entonces
						Escribir "*"
					SiNo
						Escribir Sin Saltar " "
					FinSi
				FinSi
				
				
			FinPara
		
			
		FinSi
		
	Fin Para
FinAlgoritmo
