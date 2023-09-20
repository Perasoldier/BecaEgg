//Realiza una función llamada Cooperar que reciba dos variables de tipo carácter, una variable debe
//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La función debe concatenar
//ambos textos.


//Declaramos una funcion que retorna un valor. la declaramos fuera del algortimo principal
//retornarCadena es el VALOR A retornar
//cooperar es el nombre de la funcion, que tambien usamos para llamarla dentro del Algoritmo principal
//var1,var2 son PARAMETROS, que van a ser reemplazados por ARGUMENTOS dentro del algortimo principal cuando llamemos ala Funcion
//retornarCadena es una variable LOCAL dentro de FUNCION, solo funciona ahi adentro

Funcion retornarCadena <- cooperar(var1,var2)
	Definir retornarCadena Como Caracter
	retornarCadena = var1 + " " + var2
FinFuncion

Algoritmo EjPruebaGuia
	//Definimos las variables que vamos a usar como argumento
	Definir palabra1 , palabra2 , oracion Como Caracter
	palabra1 = "Cooperando"
	palabra2 = "trabajamos mejor"
	
	//usamos la funcion, que nos retorna una frase, y la escribimos.
	//Tambien podemos usar una varible, asignarle el resultado de la Funcion 
	//oracion = cooperar(palabra1,palabra2)
	//Escribir oracion -> para que haga lo mismo que la linea 28
	Escribir cooperar(palabra1,palabra2)
	//con cooperar(palabra1,palabra2) estamos LLAMANDO la funcion
	
FinAlgoritmo