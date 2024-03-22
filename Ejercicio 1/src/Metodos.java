import interfaces.IMetodos;

public class Metodos implements IMetodos{
   
    /*
     * Implementación de los métodos de la interfaz
     * MetodoServices
     */

    /*
     * Método que determina si un número es perfecto
     * @param numero
     */
    @Override
    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }

    /*
     * Método que determina si un número es defectivo
     * @param numero
     */
    @Override
    public static boolean esDefectivo(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma < numero;
    }

    /*
     * Método que determina si un número es abundante
     * @param numero
     */
    @Override
    public static boolean esAbundante(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma > numero;
    }

}
