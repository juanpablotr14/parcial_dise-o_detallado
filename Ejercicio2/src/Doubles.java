import java.util.InputMismatchException;
import java.util.Scanner;

import Interfaces.IOperacionesDoubles;

public class Doubles implements IOperacionesDoubles{
    private Scanner scanner;

    public Doubles(Scanner scanner) {
        this.scanner = scanner;
    }

    /*
     * Este método pide al usuario 4 números decimales y realiza una operación
     * 
     * @return double
     * @throws ArithmeticException
     */
    @Override
    public double pedirNumerosYCalcularResultado() {
        double num1 = pedirNumero("\nIngrese el valor del 1° decimal: ");
        double num2 = pedirNumero("\nIngrese el valor del 2° decimal: ");
        double num3 = pedirNumero("\nIngrese el valor del 3° decimal: ");
        double num4 = pedirNumero("\nIngrese el valor del 4° decimal: ");
        
        try {
            return ((num1 + num2) * (num3 - num4)) / (num1 * num4);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }
    
    /*
     * Este método pide un número decimal al usuario
     * 
     * @param mensaje
     * @return double
     * @throws InputMismatchException
     */
    @Override
    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
            scanner.nextLine();
            return pedirNumero(mensaje); 
        }
    }

}
