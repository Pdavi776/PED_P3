package OS;

import java.io.IOException;
import java.util.Scanner;

public class OS {
    public static void limpiarPantalla() {
        try {
            String sistemaOperativo = System.getProperty("os.name").toLowerCase();
            if (sistemaOperativo.contains("win")) { // si es Windows este if se cumple
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // comando para limpiar pantalla en Windows
            } else { // En caso de no ser Windows (Linux, MacOS, etc...)
                System.out.print("\033[H\033[2J"); // codigo de escape ANSI para limpiar la pantalla
                System.out.flush(); // limpiar el buffer de salida
            }
        } catch (IOException | InterruptedException e) { // Excepciones que se pueden lanzar al ejecutar el comando
            //mensaje de error
            System.out.println("No se pudo limpiar la pantalla."); 
        }
    }

    public static void pause() {
        System.out.println("Pulse <Intro> para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
