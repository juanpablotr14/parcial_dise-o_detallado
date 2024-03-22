import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Utilidades opciones = new Utilidades(scanner);
        boolean salir = false;

        while (!salir) {

            opciones.mostrarOpciones();
            int opcion = opciones.obtenerOpcion();
            opciones.procesarOpcion(opcion);

            salir = opcion == 5;

        }

        scanner.close();

    }
}
