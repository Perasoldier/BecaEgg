
import Entity.Circunferencia;
import Entity.Curso;
import Entity.Meses;
import clasesdeservicio.ServicioCircunferencia;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
       
    /* EJEMPLO 2  
       ServicioCircunferencia service1 = new ServicioCircunferencia();
       Circunferencia Ejemplo1 = service1.crearCincurferencia();
       System.out.println("EL Area de su Circulo es: " +service1.calcularArea(Ejemplo1));     
        System.out.println("El Perimetro de su circulo es: " + service1.calcularPerimetro(Ejemplo1));*/

 /*
   10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20. 
   */ 
//    float[] arrayA = new float[50];
//    float[] arrayB = new float[20];
//    
//        for (int i = 0; i < 50; i++) {
//            arrayA[i] = (float) (Math.random()*10);
//        }
//        
////        for (int i = 0; i < 50; i++) {
////            System.out.println(arrayA[i]);
////        }
//        System.out.println("Se Ordena");
//    Arrays.sort(arrayA);
//
//    
//        for (int i = 0; i < 50; i++) {
//            System.out.println(arrayA[i]);
//        }
//    
//        for (int i = 0; i < 20; i++) {
//            if (i<10) {
//                arrayB[i]=arrayA[i];
//            }else {
//                arrayB[i]=0.5 ;
//            }
//        }
//        System.out.println("Se imprime ArrayB");
//        for (int i = 0; i < 20; i++) {
//            System.out.println((float)arrayB[i]);
//        }
        

//13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
//// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
////en una semana por curso. Para ello, se deben multiplicar la cantidad de
//
//
//Curso curso1 = new Curso();
//curso1.crearCurso();
//octubre

//curso1.calcularGananciaSemanal();
//


// ACA SE USA LAS EXPRESIONES REGULARES.

//OPERADORES TERNARIOS
//public static boolean validaCodigo(String cod){
//        int cont =0;
//        for (int i = 0; i < cod.length(); i++) {
//            if (cod.substring(i,i+1).matches("\\d+"))
//                cont++;
//        }
//        if (cont==cod.length())
//            return true;
//
//        return false;
//    }






Scanner scan = new Scanner(System.in);

//Ejercicio 5 Extraoctubre
        Meses adivinar = new Meses();
        String mes;

        do {
            System.out.println("Adivine el mes");

            mes = scan.nextLine();
            if (adivinar.getMesSecreto().equalsIgnoreCase(mes)) {
                System.out.println("Adivinaste");
            } else {
                System.out.println("No adivinaste, volve a intentar");
            }
        } while (!adivinar.getMesSecreto().equalsIgnoreCase(mes));
    }

}
