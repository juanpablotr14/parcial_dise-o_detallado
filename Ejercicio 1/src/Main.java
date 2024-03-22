import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Opciones opciones = new Opciones(scanner);
        boolean salir = false;

        while (!salir) {
            opciones.mostrarOpciones();
            int opcion = opciones.obtenerOpcion();
            if (opcion == 4) {
                opciones.procesarOpcion(opcion, 0);
            }else{
                int numero = opciones.obtenerNumero();
                opciones.procesarOpcion(opcion, numero);
            }
            salir = opcion == 4;
        }

        scanner.close();
    }
}
