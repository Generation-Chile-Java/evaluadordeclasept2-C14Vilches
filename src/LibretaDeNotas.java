import java.util.*;

public class LibretaDeNotas {
    public static void main(String[] args) {

        Scanner scannerNotas = new Scanner(System.in);

        /*/comienzo arrayList

        //listaNotas.add(scannerNotas.nextInt());
        //termino arraylist

        //comienzo hashmap
        // nombre estudiante, arraylist de notas
        Map<String, ArrayList> mapaEstudiantesNotas = new HashMap<>();
        //mapaEstudiantesNotas.put(nombreEstudiante, new ArrayList());
        //termino hashmap*/

        HashMap<String, ArrayList> mapaEstudiantesNotas = new HashMap<>();

        //comienzo programa

        System.out.println("\n Bienvenidos a la Calculadora de Notas. Por favor ingrese los siguientes datos para comenzar.");

        System.out.println("Primero, el numero de estudiantes a ingresar: ");
        int cantidadEstudiantes = Integer.parseInt(scannerNotas.nextLine());

        /*do {
            //System.out.println();
        } while (cantidadEstudiantes < 0);*/

        System.out.println("Ok, ahora ingrese cuantas notas seran por estudiante:");
        int cantidadNotas = Integer.parseInt(scannerNotas.nextLine());

        //ingreso notas y estudiantes

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            ArrayList<Float> listaNotas = new ArrayList<>();
            System.out.println("Ingrese el nombre del estudiante numero " + i);
            //.next() funciono minetras que .nextLine() no
            String nombreEstudiante = scannerNotas.next();
            System.out.println("Por favor ingrese las siguientes calificaciones con el punto seguido del primer decimal.");

            for (int j = 1; j <= cantidadNotas; j++) {
                System.out.println(" Nota numero " + j + " del estudiante que se llama " + nombreEstudiante);
                Float notaAlumno = scannerNotas.nextFloat();

                while (notaAlumno > 10 || notaAlumno < 0) {
                    System.out.println("Se produjo un error. Por favor evite ingresar numeros negativos o mayores que 10.");
                    System.out.println(" Nota numero " + j + " del estudiante que se llama " + nombreEstudiante);
                    notaAlumno = scannerNotas.nextFloat();
                }
            }
            mapaEstudiantesNotas.put(nombreEstudiante, listaNotas);
        }

        // System.out.println("Este es el listado de almunos, y sus notas: \n" + mapaEstudiantesNotas);

        //recorer hashmap (???)
        for (String nombreEstudiante : mapaEstudiantesNotas.keySet()) {
            ArrayList<Float> notas = mapaEstudiantesNotas.get(nombreEstudiante);
            float sumaNotas = 0f;
            float promedio = 0f;
            float maxNotas = 0f;
            float minNotas = 10f;

            // Calcular la suma de notas, nota máxima y mínima
            for (Float nota : notas) {
                sumaNotas += nota;
                // Nota Máxima
                if (nota > maxNotas) {
                    maxNotas = nota;
                }
                // Nota Mínima
                if (nota < minNotas) {
                    minNotas = nota;
                }
            }
            // Calcular el promedio
            promedio = sumaNotas / notas.size();

            //  Lista de resultados
            System.out.println("Nombre del estudiante: " + nombreEstudiante);
            System.out.println("Notas: " + notas);
            System.out.println("Promedio: " + promedio);
            System.out.println("Nota Máxima: " + maxNotas);
            System.out.println("Nota Mínima: " + minNotas + "\n");
        }

        //menu de opciones
        int op;
        System.out.println("Menu de opciones:\nElija la opcion que desea ingresando del numero 0 al 3:\n1.-Promedio de notas de cada estudiante.\n2.- Aprobacion o reprobacion de una nota.\n3.-Comparar nota del estudiante con el promedio general.\n0.-Salir del menu.");
        op = scannerNotas.nextInt();

        switch (op){
            case 1:
            case 2:
            case 3:
            case 0:
        }


        /*int e = scannerNotas.nextLine();

        if (scannerNotas == 1) {

        } else if(scannerNotas = 2) {

        } else if(scannerNotas = 3) {

        } else if(scannerNotas = 0) {

        } else {
            System.out.println();
        }*/

        /*System.out.println("Por favor ingrese las siguientes calificaciones con el primer decimal y sin puntos o comas. \n Comencemos por la nota numero " );
        long bla = scannerNotas.nextInt();
        System.out.println("Ahora, la nota numero " );
        long blab = scannerNotas.nextInt();
        System.out.println("Finalmente, la nota numero " );
        long blabb = scannerNotas.nextInt();
        //lenguaje + matematica + historia dividido en 30.0 para tomar decimal
        double notaFinal = ((bla + blab + blabb) /30.0);






        //agregar un switch en caso que note sea 10 perfecto
        if (notaFinal < 0 || notaFinal > 10) { //comienzo verificador
            System.out.println("El valor de la nota es incorrecta, intentelo nuevamente.");
        } else {
            if (notaFinal > 0 && notaFinal <= 3) {
                System.out.println("Calificacion: " + notaFinal + " - No Aprobado");
            } else if (notaFinal > 3 && notaFinal <= 5) {
                System.out.println("Calificacion: " + notaFinal + " - Insuficiente");
            } else if (notaFinal > 5 && notaFinal <= 8) {
                System.out.println("Calificacion: " + notaFinal + " - Aceptable");
            } else {
                System.out.println("Calificacion: " + notaFinal + " - Excelente");
            }
        } //termino verificador if*/

    } //MainEnd
}
