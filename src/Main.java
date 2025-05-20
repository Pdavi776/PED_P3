import OS.OS;
import java.util.Scanner;
import Menus.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            MenuPrincipal.mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Crear los AB de enteros
                    OS.limpiarPantalla();
                    break;
                case 2:
                    // Listado de claves en InOrden
                    OS.limpiarPantalla();
                    break;
                case 3:
                    // Listado de claves en InOrden Converso
                    OS.limpiarPantalla();
                    break;
                case 4:
                    // Listado de claves en PreOrden
                    OS.limpiarPantalla();
                    break;
                case 5:
                    // Listado de claves en PostOrden
                    OS.limpiarPantalla();
                    break;
                case 6:
                    // Listado de claves por Niveles
                    OS.limpiarPantalla();
                    break;
                case 7:
                    // Comprobar si dos árboles son iguales
                    OS.limpiarPantalla();
                    break;
                case 8:
                    // Comprobar Simetría de un AB
                    OS.limpiarPantalla();
                    break;
                case 9:
                    // Comprobar Parientes
                    OS.limpiarPantalla();
                    break;
                case 10:
                    // Valor mínimo de cada nivel
                    OS.limpiarPantalla();
                    break;
                case 11:
                    // Comprobar suma de claves
                    OS.limpiarPantalla();
                    break;
                case 12:
                    // Vaciar Árbol Modo 1 (sin recorrer el árbol)
                    OS.limpiarPantalla();
                    break;
                case 13:
                    // Vaciar Árbol Modo 2 (recorriendo todos sus nodos)
                    OS.limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
