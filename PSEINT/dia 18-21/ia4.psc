Proceso MenuVectores
    Definir N, Opcion como Entero
    Definir A, B, C como Vector[N] de Entero
    Definir i como Entero
	
    Escribir "Ingrese el tamaño de los vectores:"
    Leer N
	
    Mientras Opcion <> 6 Hacer
        Escribir "MENU DE OPCIONES"
        Escribir "-----------------"
        Escribir "1. Llenar Vector A"
        Escribir "2. Llenar Vector B"
        Escribir "3. Llenar Vector C con la suma de A y B"
        Escribir "4. Llenar Vector C con la resta de B y A"
        Escribir "5. Mostrar vector"
        Escribir "6. Salir"
        Escribir "Seleccione una opción:"
        Leer Opcion
		
        Segun Opcion Hacer
            1:
                Para i = 0 Hasta N-1 Con Paso 1 Hacer
                    A[i] = Aleatorio(-100, 100)
                FinPara
                Escribir "Vector A llenado con éxito"
            2:
                Para i = 0 Hasta N-1 Con Paso 1 Hacer
                    B[i] = Aleatorio(-100, 100)
                FinPara
                Escribir "Vector B llenado con éxito"
            3:
                Para i = 0 Hasta N-1 Con Paso 1 Hacer
                    C[i] = A[i] + B[i]
                FinPara
                Escribir "Vector C llenado con éxito"
            4:
                Para i = 0 Hasta N-1 Con Paso 1 Hacer
                    C[i] = B[i] - A[i]
                FinPara
                Escribir "Vector C llenado con éxito"
            5:
                Escribir "Seleccione el vector a mostrar: "
                Escribir "1. Vector A"
                Escribir "2. Vector B"
                Escribir "3. Vector C"
                Leer Opcion
                Segun Opcion Hacer
                    1: Escribir "Vector A:", A
                    2: Escribir "Vector B:", B
                    3: Escribir "Vector C:", C
                FinSegun
            6:
                Escribir "Adiós"
            De Otro Modo:
                Escribir "Opción no válida"
        FinSegun
    FinMientras
FinProceso