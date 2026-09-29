import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lanzador lanzador = new Lanzador();

        // Preguntamos al usuario que nivel desea ejecutar al arrancar
        System.out.println("¿Qué nivel quieres usar? (1, 2, 3 o 4):");
        System.out.print("> ");
        String opcionNivel = scanner.nextLine().trim();

        int nivel = 1;
        try {
            nivel = Integer.parseInt(opcionNivel);
        } catch (NumberFormatException e) {
            System.out.println("Opción no válida. Se utilizará el Nivel 1 por defecto.");
        }

        // Bucle principal
        while (true) {
            System.out.println("Introduce un número (o 'salir' para terminar):");
            System.out.print("> ");
            String entrada = scanner.nextLine().trim();

            // Condición de parada del bucle
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            int codigoSalida = -1;
            if (nivel == 2) {
                codigoSalida = lanzador.ejecutarNivel2(entrada);
            } else {
                codigoSalida = lanzador.ejecutarNivel1(entrada);
            }
            System.out.println("Operación completada. Código de salida: " + codigoSalida);
        }

        scanner.close();
    }
}