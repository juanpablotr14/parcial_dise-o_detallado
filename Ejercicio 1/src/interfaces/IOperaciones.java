public interface IOperaciones {
    void mostrarOpciones();
    int obtenerOpcion(Scanner scanner);
    int obtenerNumero(Scanner scanner);
    void procesarOpcion(int opcion, int numero);
}
