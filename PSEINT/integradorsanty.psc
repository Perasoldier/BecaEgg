Algoritmo integrador
	definir i,j,n como entero
	Definir palabra,matriz Como Caracter
	definir valida como logico
	
	Hacer
		
		Hacer
//			Escribir "Ingrese palabra"
			//			leer palabra
			palabra="CCADDBACCDDDDBDBCCABBAABDBCDCADDABABCDCDDABBBCABBABBDCADCCDABDDACDBBBDBDCCDDCABCAAAACDCDCCACDCDDADAADDACBDBCCDDBCBCBBAAADDAADCAABBBCBCCBCBDBCCBBCBABADAACDBDBADCBBACDADAADABBDBDBDBDCCDDCABCCCCCADBBBBCCDACCBBBDBDAADDBCCBCCBCBDDDDCCBAAACDDBBCAABAADABBBCCCCDCCBBDCDABCDACBCBACDBCCDABDBDCDCADCCBBADDBDCCADCCDCCACCDCDBCDBBADBAADBBCAADDABCAADADAABAACCBABDADADADDBCABDCCBBAADDDCDDCBADBCACCAAADCCDDABDBACBCAAADDBADBDACDDBDCBDCCCDDCACBCCCACCCCBACBAAAAACBCBCDAADCAACBCABDDABCBCBACCADABBBABBBBBAACADDDDBABACADAAABDDDCCDCACAACACADADBABACBABDBBADCDBBDACDCAABCADDBDBDCAABDCDABDDADDCDDBCBCDADCDBBDACABCDAABBCBADDDBCBADCABACDCABBCBCBCBCADBABBDBCCCADCADDCBABBDDDBBCBCDABACDDDABCCDBACCBDBADADDDAAACBDCDCCAACBDDCDCBADACDDDDBDCBAACDADBBDBDBCCACADBAABBAADAADDDACDDCDBDDBBDAADDAACCCACDBBBBBDCDCDDDABBCBAAADACADDCDCDCBCDCACAAABCADBDBBDDACCBBDABDDBCADCCCADDCDBACBBBDAADDCDAAADBBCDADBDBCBDDCAABCCDCCDCABCAACADADAACADDBBDABAABACDACDCDBBDDCCBCBCAAACBDBDBBBDBDBBCADCBACDCCBDACBBACBCADCDBACCADCDBDCDBBACBBCDCAAAAABCCDDCDDBBCBABCBCAABDBCCACBABDCABAACBDBDBCCCCADBBCDCCCAABADBACDDBADCDCAADDDCBDDBDCDCCCCCCCDBCDDBACBBCDACDADCACBDBBCCCDCCBCBCDACBDDDACCCAADBDBBDADDCCDDDBCDABCCBACCCCCBAACCBCABAAABBCABBCACCCABCDACBCDBDACACDDCACBCBBCCADABCBBDDABADDAAABACCBDCDABCBBBBACCDABAACDCACCCBBCDDACCDBCBCBAACBBBBADBCBCDABAAAABADAAAACDACADACDBBCCABADDDCACDCAACCDABBDBDAABADDBDCCCACDADBDDDCBBCBDCADCBCDAABDDDDBBBBCDDCC"
			palabra=Mayusculas(palabra)
		Mientras Que longitud(palabra)<>9 y Longitud(palabra)<>16 y Longitud(palabra)<>1369
		
		para i<-0 hasta Longitud(palabra)-1 Hacer
			si subcadena(palabra,i,i) = "A" o subcadena(palabra,i,i) = "B" o subcadena(palabra,i,i) = "C" o subcadena(palabra,i,i) = "D"
				valida= Verdadero
			SiNo
				valida=Falso
				i=Longitud(palabra)-1
			FinSi
		FinPara
	Mientras Que valida<>Verdadero
	
	si Longitud(palabra)==9 Entonces
		n=3
	SiNo
		si longitud(palabra)==16 Entonces
			n=4
		SiNo
			si longitud(palabra)==1369 Entonces
				n=37
			FinSi
		FinSi
	FinSi
	
	Dimension matriz[n,n]
	
	inicializarMAtriz(matriz,palabra,n)
	imprimirMatriz(matriz,n)
	Escribir comprobarGenZ(matriz,n)
	
FinAlgoritmo


SubProceso inicializarMAtriz(matriz,palabra,n)
	definir L,i,j Como Entero
	L=0
	para i=0 hasta n-1 hacer
		para j<-0 hasta n-1 Hacer
			matriz[i,j]=subcadena(palabra,L,L)
			L=L+1
		FinPara
	FinPara
FinSubProceso

subproceso ImprimirMatriz(matriz,n)
	definir i,j Como Entero
	para i<-0 hasta n-1
		para j<-0 hasta n-1
			escribir sin saltar matriz[i,j] , " "
		FinPara
		escribir ""
	FinPara
FinSubProceso

SubProceso genZ<-comprobarGenZ(matriz,n)
	definir i, j como entero
	Definir genZ,diagonalPrincipal, diagonalSecundaria Como Logico
	definir diag1, diag2 como caracter
	diag1=matriz[0,0]
	diag2=matriz[0,n-1]
	
	para i<-0 hasta n-1
		para j<-0 hasta n-1
			si i==j y matriz[i,j]==diag1 Entonces
				diagonalPrincipal=verdadero
			SiNo
				diagonalPrincipal= Falso
				i=(n-1)
			FinSi
		FinPara
	FinPara
	
	para i<-0 hasta n-1
		para j<-n-1 hasta 0
			si j+i==n-1 y matriz[i,j]==diag2 Entonces
				diagonalSecundaria=verdadero
			SiNo
				diagonalSecundaria= Falso
				i=(n-1)
			FinSi
		FinPara
	FinPara
	
	si diagonalPrincipal y diagonalSecundaria Entonces
		genZ=Verdadero
	SiNo
		genZ=Falso
	FinSi
	
FinSubProceso












