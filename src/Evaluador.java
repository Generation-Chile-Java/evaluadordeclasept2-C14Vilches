import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner scannerNotas = new Scanner(System.in);

        System.out.println("Bienvenidos a la Calculadora de Notas: \n Por favor ingrese las siguientes calificaciones con el primer decimal y sin puntos o comas. \n Primero, la nota de Lenguaje:");
        long a = scannerNotas.nextInt();

        System.out.println("Ahora, la nota de Matematicas:");
        long b = scannerNotas.nextInt();

        System.out.println("Finalmente, la nota de Historia y CC.SS.: ");
        long c = scannerNotas.nextInt();

        //lenguaje + matematica + historia dividido en 30.0 para tomar decimal
        double notaFinal = ((a + b + c) /30.0);

        if (notaFinal < 0 || notaFinal > 10) {
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
        }
        //end
    }
}
