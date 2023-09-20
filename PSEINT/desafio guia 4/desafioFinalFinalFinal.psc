Algoritmo materiales_construccion
	menu
FinAlgoritmo

SubProceso menu
	definir respuesta Como Entero
	Definir num como entero
	respuesta=1
	hacer
		
	Escribir "1.! Calcular muro de ladrillo"
	Escribir "2.! Calcular viga de hormigón"
	Escribir "3.! Calcular columnas de hormigón"
	Escribir "4.! Calcular contrapisos"
	Escribir "5.! Calcular techo"
	Escribir "6.! Calcular pisos"
	Escribir "7.! Calcular pintura"
	Escribir "8.! Calcular iluminación"
	Escribir "9.! Salir"
	Escribir "Ingrese opcion:"
	leer num
	Segun num Hacer
		1:
			calcularMuro
		2:
			calcularViga
		3:
			calcularColumna
		4:
			calcularContrapiso
		5:
			calcularTecho
		6:
			calcularPisos
		7:
			calcularPintura
		8:
			calcularIluminacion
		9:
			respuesta = 9
	Fin Segun
		si respuesta <> 9
		Escribir "Si desea volver al menu principal presione enter"
		Escribir "Si desea finalizar escriba 9"
		leer respuesta
	FinSi
	
Mientras Que respuesta <> 9 
FinSubProceso

SubProceso superficie<-calcularSuperficie(largo,alto)
	definir superficie como real
	superficie=largo*alto
FinSubProceso

SubProceso volumen<-calcularVolumen(largo,alto,espesor)
	Definir volumen como real
	volumen = largo*alto*(espesor/100)
FinSubProceso

SubProceso calcularMuro
	Definir espesor, alto, largo Como reales
	Hacer
		Escribir "Ingrese el espesor del muro (20cm o 30cm): "
		leer espesor
	Mientras Que espesor <> 20 y espesor <>30
	Escribir "Ingrese el alto del muro (En Metros): "
	leer alto
	Escribir "Ingrese el largo del muro (En Metros): "
	leer largo
	escribir "La superficie a trabajar: ",calcularSuperficie(largo,alto), " Mts2"
	
	si espesor == 30 Entonces
		Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) * 15.2, " KG de cemento"
		Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) *0.115 , " Mts3 de arena" 
		Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) * 120, " Ladrillos"
	SiNo
				Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) * 10.9, " KG de cemento"
				Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) *0.09 , " Mts3 de arena" 
				Escribir "Necesitaremos " ,calcularSuperficie(largo,alto) * 90, " Ladrillos"
		
		
	FinSi
FinSubProceso

SubProceso calcularViga
	Definir largo Como Real
	Escribir "Ingresar largo de la viga: "
	leer largo
	Escribir "Se necesitaran ", largo* 9, " Kg de cemento"
	Escribir "Se necesitaran ", largo* 0.02, " m3 de arena"
	Escribir "Se necesitaran ", largo* 0.02, " metros de piedra"
	Escribir "Se necesitaran ", largo* 4, " Metros de hierro del 8"
	Escribir "Se necesitaran ", largo* 3, " Metros de hierro del 4"
FinSubProceso

SubProceso calcularColumna
	Definir largo Como Real
	Escribir "Ingrese el largo de la columna: "
	Leer largo
	
	Escribir Sin Saltar "Se necesitara ", largo*7.5, "kg de cemento, "
	Escribir Sin Saltar largo*0.016, "mts3 de arena, "
	Escribir sin saltar largo*0.016, "mts2 de piedra, "
	Escribir Sin Saltar largo*6, "mts de hierro del 10, "
	Escribir "y " largo*3, "mts de hierro del 4"
	
FinSubProceso

SubProceso calcularPisos
	definir anchoPiso,largoPiso, superficiepiso Como real
	
	escribir ' ingrese el ancho del piso'
	leer anchoPiso
	
	escribir' ingrese el largo del piso'
	leer largoPiso
	
	superficiepiso=calcularsuperficie(anchoPiso,largoPiso) * 0.10 + calcularsuperficie(anchoPiso,largoPiso)
	
	Escribir 'la superficie para el piso es ', superficiepiso, " m2"
FinSubProceso

SubProceso calcularPintura
	Definir alto, largo Como real
	Definir resultadoFinal Como Real
	
	Escribir "Ingrese el alto del muro"
	Leer alto
	Escribir "Ingrese el largo del muro"
	Leer largo
	
	resultadoFinal <- (calcularSuperficie(alto, largo)) / 6
	Escribir "Se necesitan para pintar el muro " resultadoFinal, " lts de pintura."
	
FinSubProceso

//SubProceso calcularPintura
//	Definir superficie Como Real
//	Escribir "Ingrese la superficie a pintar en m2: "
//	leer superficie
//	Escribir "Va a necesitar ", superficie/6, " litros de pintura para pintar ",superficie, " m2"
//FinSubProceso

//subprograma calcularIluminacion
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//	superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//	puertas de vidrio). Mostrar resultado

SubProceso calcularIluminacion
	Definir alto, largo Como Entero
	Definir resultadoFinal Como Real
	
	Escribir "Ingrese el alto del muro"
	Leer alto
	Escribir "Ingrese el largo del muro"
	Leer largo
	
	resultadoFinal <- calcularSuperficie(alto, largo) * 0.20
	Escribir "Se necesitan ", resultadoFinal," m2 de aberturas para iluminar la habitacion."
	
FinSubProceso

SubProceso calcularTecho
	// Pedir datos al usuario
	Definir espesor,ancho,largo,m2_techo,cant_cemento,cant_arena, cant_piedra, cant_hierro8, cant_hierro6 Como Real
	Escribir "Ingrese el espesor del techo en cm:"
	Leer espesor
	Escribir"Ingrese el ancho del techo en metros:"
	Leer ancho
	Escribir "Ingrese el largo del techo en metros:"
	Leer largo
	// Calcular cantidad de materiales
	m2_techo = ancho * largo
	cant_cemento = 33 * m2_techo
	cant_arena = 0.072 * m2_techo
	cant_piedra = 0.072 * m2_techo
	cant_hierro8 = 7 * m2_techo
	cant_hierro6 = 4 * m2_techo
	// Mostrar cantidad de materiales necesarios
	Escribir "Para cubrir un techo de ", ancho, "m x ", largo, "m y espesor de ", espesor, "cm se necesitan:"
	Escribir cant_cemento, " kg de cemento"
	Escribir cant_arena, " m3 de arena"
	Escribir cant_piedra, " m3 de piedra"
	Escribir cant_hierro8, " m de hierro del 8"
	Escribir cant_hierro6, " m de hierro del 6"
FinSubProceso

SubProceso calcularContrapiso
	Definir largo,alto,espesor Como Real
	Escribir "Ingrese el espesor del contrapiso (En centimetros): "
	leer espesor
	Escribir "Ingrese el alto del contrapiso (En Metros): "
	leer alto
	Escribir "Ingrese el largo del contrapiso (En Metros): "
	leer largo
	
	Escribir "Necesitaremos " ,calcularVolumen(largo,alto,espesor) * 105, " KG de cemento"
	Escribir "Necesitaremos " ,calcularVolumen(largo,alto,espesor) *0.43, " Mts3 de arena" 
	Escribir "Necesitaremos " ,calcularVolumen(largo,alto,espesor) * 0.9, " M3 de piedra"
FinSubProceso
	