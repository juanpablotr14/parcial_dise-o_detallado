import java.util.InputMismatchException;
import java.util.Scanner;

import Interfaces.IPrimo;

public class Primo implements IPrimo{

    private Scanner scanner;

    public Primo(Scanner scanner) {
        this.scanner = scanner;
    }

    /*
     * Este método verifica si un número es primo
     * 
     * @return void
     * @throws InputMismatchException
     */
    public void esPrimo() {

		boolean salida = true;
        int iterador = 2;

        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            while ((salida) && (iterador != numero)) {
                if (numero % iterador == 0) {
                    salida = false;
                }
                iterador++;
            }

            if (salida) {
                System.out.println("El número " + numero + " es primo");
            } else {
                System.out.println("El número " + numero + " no es primo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
            scanner.nextLine();
        }
	}

}
