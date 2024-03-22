import java.util.Scanner;

public class Opciones {
    private Scanner scanner;

    public Opciones(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarOpciones() {
        System.out.println("\n------- Programa para detectar numeros -------\n");
        System.out.println("1. Perfecto");
        System.out.println("2. Definitivo");
        System.out.println("3. Abundante");
        System.out.println("4. Salir\n");
    }

    public int obtenerOpcion() {
        System.out.print("\nSeleccione una de las opciones: ");

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Ingrese una opción válida: ");
        }
        return scanner.nextInt();
    }

    public int obtenerNumero() {
        System.out.print("\nIngrese un número: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Ingrese un número válido: ");
        }
        return scanner.nextInt();
    }

    public void procesarOpcion(int opcion, int numero) {
        switch (opcion) {
            case 1:
                System.out.println("\n------- Verificar si el numero es Perfecto -------\n");
                boolean respuestaPerfecto = Metodos.esPerfecto(numero);
                String tipoPerfecto = respuestaPerfecto ? "es" : "no es";
                System.out.printf("El número %d %s perfecto\n", numero, tipoPerfecto);
                break;
            case 2:
                System.out.println("\n-------- Verificar si el nuemro es Definitivo --------\n");
                boolean respuestaDefectivo = Metodos.esDefectivo(numero);
                String tipoDefectivo = respuestaDefectivo ? "es" : "no es";
                System.out.printf("El número %d %s defectivo\n", numero, tipoDefectivo);
                break;
            case 3:
                System.out.println("\n-------- Verificar si el numero es Abundante --------\n");
                boolean respuestaAbundante = Metodos.esAbundante(numero);
                String tipoAbundante = respuestaAbundante ? "es" : "no es";
                System.out.printf("El número %d %s abundante\n", numero, tipoAbundante);
                break;
            case 4:
                System.out.println("Hasta Luego! :)");
                break;
            default:
                System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.\n");
                break;
        }

        scanner.nextLine();
    }

}