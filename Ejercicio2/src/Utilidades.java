import java.util.Arrays;
import java.util.Scanner;

import Interfaces.IUtilidades;

public class Utilidades implements IUtilidades{

	private Scanner scanner;

    public Utilidades(Scanner scanner) {
        this.scanner = scanner;
    }

    /*
     * Este método muestra las opciones del menú
     * 
     * @return void
     */
	public void mostrarOpciones() {
        System.out.println("\n------- Ejercicio 2 -------\n");
        System.out.println("1. Metodo Burbuja con Strings");
		System.out.println("2. Metodo Burbuja con Enteros");
        System.out.println("3. Verificar si un numero es primo");
        System.out.println("4. Realizar Operación de Decimales");
        System.out.println("5. Salir\n");
    }

    /*
     * Este método obtiene la opción seleccionada por el usuario
     * 
     * @return int
     * @throws InputMismatchException
     */
	public int obtenerOpcion() {
        System.out.print("Seleccione una de las opciones: "); 
        try {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Ingrese una opción válida: ");
            }
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
            scanner.nextLine();
            return obtenerOpcion();
        }
    }

    /*
     * Este método procesa la opción seleccionada por el usuario
     * 
     * @param opcion
     * @return void
     */
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("\n------- Metodo Burbuja con Strings -------\n");
                String[] arregloNombres = { "Leon", "Chris", "Jill", "Wesker", "Ada" };
                MetodoBurbuja metodoBurbujaStr = new MetodoBurbuja();
                
                System.out.println("Antes del método burbuja: " + Arrays.toString(arregloNombres));
                metodoBurbujaStr.burbujaStrings(arregloNombres);
                System.out.println("Después del método de la burbuja: " + Arrays.toString(arregloNombres));

                break;
            case 2:
                System.out.println("\n-------- Metodo Burbuja con Enteros --------\n");
                int arregloNumeros[] = { 1, 9, 23, 4, 55, 100, 1, 1, 23 };
                MetodoBurbuja metodoBurbujaInt = new MetodoBurbuja();

                System.out.println("Antes del método burbuja: " + Arrays.toString(arregloNumeros));
                metodoBurbujaInt.burbujaEnteros(arregloNumeros);
                System.out.println("Después del método de la burbuja: " + Arrays.toString(arregloNumeros));

                break;
            case 3:
                System.out.println("\n-------- Verificar si un numero es primo --------\n");
                Primo primo = new Primo(scanner);
                primo.esPrimo();
                break;
            case 4:
                System.out.println("\n-------- Realizar Operación de Decimales --------\n");
                Doubles doubles = new Doubles(scanner);
                double resultado = doubles.pedirNumerosYCalcularResultado();
                System.out.println("\nEl resultado de la operación es: " + resultado);
                break;
            case 5:
                System.out.println("Hasta Luego! :)");
                break;
            default:
                System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.\n");
                break;
        }

        scanner.nextLine();
    }

}