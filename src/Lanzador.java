import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {

    public int ejecutarNivel1(String numero) {
        try {
            // Crear el ProcessBuilder pasando el comando y sus argumentos por separado
            ProcessBuilder pb = new ProcessBuilder("factor", numero);

            // Arrancar el proceso
            Process proceso = pb.start();

            // Leemos la salida estándar (stdout) generada por el proceso hijo
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            }

            // Leer la salida de error por si el comando falla
            try (BufferedReader errReader = new BufferedReader(new InputStreamReader(proceso.getErrorStream()))) {
                String linea;
                while ((linea = errReader.readLine()) != null) {
                    System.out.println(linea);
                }
            }

            // Esperar a que el proceso termine para obtener el codigo
            return proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error al ejecutar el proceso: " + e.getMessage());
            return -1;
        }
    }

    public int ejecutarNivel2(String numero) {
        try {
            ProcessBuilder pb = new ProcessBuilder("factor", numero);
            Process proceso = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println("[OK] " + linea);
                }
            }

            try (BufferedReader errReader = new BufferedReader(new InputStreamReader(proceso.getErrorStream()))) {
                String linea;
                while ((linea = errReader.readLine()) != null) {
                    System.out.println("[ERROR] " + linea);
                }
            }

            return proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error al ejecutar el proceso: " + e.getMessage());
            return -1;
        }
    }
}